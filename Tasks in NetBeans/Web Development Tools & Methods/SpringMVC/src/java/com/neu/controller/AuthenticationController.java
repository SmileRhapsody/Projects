/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;

import com.neu.edu.dao.MessageDao;
import com.neu.edu.dao.UserDao;
import com.neu.edu.pojo.Login;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Administrator
 */
public class AuthenticationController extends AbstractController {
    
    public AuthenticationController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        HttpSession session = request.getSession();
        ModelAndView mv=null;
        
        String option = request.getParameter("option")==null?"":request.getParameter("option");
        
        if(session.getAttribute("USER") == null && option.equals("")){
            return new ModelAndView("loginPage");
        }
        
        String userName=request.getParameter("uerName");
        String password = request.getParameter("password");
        UserDao user = new UserDao();
        MessageDao msg = new MessageDao();
        
        switch(option){
            case "logout":
                session.invalidate();
                mv = new ModelAndView("loginPage");
                break;  
            case "login":
                Login loggedUser = user.authenticateLogin(userName, password);
                if(loggedUser ==null){
                    mv = new ModelAndView("loginPage");
                }else{
                    session.setAttribute("USER", loggedUser);
                    mv = new ModelAndView(new RedirectView("/SpringMVC/messageHome.htm",false)); 
                }
                break;
            case "register":
                int registerUser = user.addUser(userName, password);
                if(registerUser == 1){
                    Login loggeduser = new Login(userName, password);
                    session.setAttribute("USER",loggeduser);
                    mv = new ModelAndView(new RedirectView("/SpringMVC/messageHome.htm",false));
                }else{
                    mv = new ModelAndView("loginPage");
                }
                break;
                
            default:
                mv = new ModelAndView(new RedirectView("/SpringMVC/messageHome.htm",false));
        }
        return mv;
    }
    
}
