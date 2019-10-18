/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;

import com.neu.edu.dao.MessageDao;
import com.neu.edu.pojo.Login;
import com.neu.edu.pojo.Message;
import java.util.List;
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
public class MessageController extends AbstractController {
    
    public MessageController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        ModelAndView mv = null;
        HttpSession session = request.getSession();
        Login loggedUser = (Login) session.getAttribute("USER");
        
        if(loggedUser == null){
            response.sendRedirect("/");
        }else{
            String option = request.getParameter("option")==null?"":request.getParameter("option");
            MessageDao msgDao = new MessageDao();
            switch(option){
                case "send":
                    String message = request.getParameter("message");
                    String from = request.getParameter("sender");
                    String to = request.getParameter("recipient");
                    int result = msgDao.addMessages(to, from, message);
                    
                    if(result ==1){
                        mv = new ModelAndView(new RedirectView("/SpirngMVC/messageHome.htm",false));
                    }else{
                        mv = new ModelAndView("error","message","Not able to send message");
                    }
                    break;
                
                default:
                    List<Message> userMessages = msgDao.getMessages(loggedUser.getUsername());
                    mv = new ModelAndView("messageHome","userMessages",userMessages);
            }
        }
        return mv;
    }
    
}
