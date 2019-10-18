/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.misc.BASE64Decoder;

/**
 *
 * @author Administrator
 */
public class Security extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String authorization = request.getHeader("Authorization");
        if(authorization == null){
            askForPassword(response);
        }else{
            String userInfo = authorization.substring(6).trim();
            BASE64Decoder decoder = new BASE64Decoder();
            String nameAndPassword = new String(decoder.decodeBuffer(userInfo));
            int index = nameAndPassword.indexOf(":");
            String user = nameAndPassword.substring(0,index);
            String password = nameAndPassword.substring(index+1);
            
            if(areEqualReversed(user,password)){
                request.getRequestDispatcher("view.jsp").forward(request, response);
            }else{
                askForPassword(response);
            }
        }
    }
    
    private void askForPassword(HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setHeader("www-Authenticate", "BASIC realm='insider-Trading'");
    }
    
    private boolean areEqualReversed(String s1, String s2){
        s2 = (new StringBuffer(s2)).reverse().toString();
        return((s1.length()>0) && s1.equals(s2));
    }
}
