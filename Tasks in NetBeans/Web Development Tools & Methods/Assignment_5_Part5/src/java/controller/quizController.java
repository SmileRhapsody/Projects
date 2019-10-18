/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;
import pojo.Result;

/**
 *
 * @author Administrator
 */
public class quizController extends AbstractWizardFormController{

    private String successView;
    private String cancelView;
    public String getCancelView() {
        return cancelView;
    }

    public void setCancelView(String cancelView) {
        this.cancelView = cancelView;
    }

    public String getSuccessView() {
        return successView;
    }

    public void setSuccessView(String successView) {
        this.successView = successView;
    }
    
    protected Map referenceData(HttpServletRequest request, int page) throws Exception { 
        Map map = new HashMap(); 
        if(page==0) {
            map.put("title", "Question 1: Which method doesn't exist in HttpServlet class:");
            map.put("question", Arrays.asList("Post", "Init", "Get", "Opiton")); 
            map.put("pageNumber",0);
        } 
        if(page==1) {
            map.put("title", "Question 2: Which life cycle method is called once in servlet life:");
            map.put("question", Arrays.asList("class loading", "init()", "service()", "destroy()")); 
            map.put("pageNumber",1);
        } 
        if(page==2) {
            map.put("title", "Question 3: Which life-cycle method make ready the servlet for garbage collection:");
            map.put("question", Arrays.asList("init", "service", "system.gc", "destroy")); 
            map.put("pageNumber",2);
        } 
        if(page==3) {
            map.put("title", "Question 4: Which http method is idempotent:");
            map.put("question", Arrays.asList("get", "post", "trace", "option")); 
            map.put("pageNumber",3);
        } 
        return map; 
    } 
    
    
    @Override
    protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object object, BindException be) throws Exception {
        Result result=(Result)object;
        ModelAndView mv = new ModelAndView(this.getSuccessView(),"result", result);
        mv.addObject("pageAttribute","finish");
        return mv; 
    }
    
    @Override
    protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object object, BindException be) throws Exception {
         
        return new ModelAndView(this.getCancelView(),"pageAttribute","cancel");
    }
 
    
    
}
