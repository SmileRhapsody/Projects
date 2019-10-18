/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import pojo.Question;
import pojo.Result;

/**
 *
 * @author Administrator
 */
public class quizController extends AbstractController {
    
    public quizController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        Result result = null;
        HttpSession session = request.getSession();
        if(session.getAttribute("result")==null){
            result = new Result();
            session.setAttribute("result", result);
        }else{
            result = (Result) session.getAttribute("result");
        }
        ModelAndView mv = null;
        
        String page = request.getParameter("page") == null ? "1":request.getParameter("page");
        int pageNumber = Integer.parseInt(page);
        
        switch(page){
            case("1"):
                Question q1 = new Question();
                q1.setTitle("Question 1: Which method doesn't exist in HttpServlet class?");
                q1.addOptions("post", "init", "get", "option");
                mv = new ModelAndView("index");
                mv.addObject("url", ""+(pageNumber+1)+".htm");
                mv.addObject("question", q1);
                mv.addObject("pageNumber",pageNumber);
                break;
            case("2"):
                result.addAnswer(request.getParameter("question"+(pageNumber-1)));
                session.setAttribute("result", result);
                Question q2 = new Question();
                q2.setTitle("Question 2: Which life-cycle method make ready the servlet for garbage collection?");
                q2.addOptions("init", "service", "system.gc", "destroy");
                mv = new ModelAndView("index");
                mv.addObject("url", ""+(pageNumber+1)+".htm");
                mv.addObject("question", q2);
                mv.addObject("pageNumber",pageNumber);
                break;
            case("3"):
                result.addAnswer(request.getParameter("question"+(pageNumber-1)));
                session.setAttribute("result", result);
                Question q3 = new Question();
                q3.setTitle("Question 3: Which http method is idempotent?");
                q3.addOptions("get", "post", "trace", "option");
                mv = new ModelAndView("index");
                mv.addObject("url", ""+(pageNumber+1)+".htm");
                mv.addObject("question", q3);
                mv.addObject("pageNumber",pageNumber);
                break;
            case("4"):
                result.addAnswer(request.getParameter("question"+(pageNumber-1)));
                session.setAttribute("result", result);
                Question q4 = new Question();
                q4.setTitle("Question 4: Which life cycle method is called once in servlet life?");
                q4.addOptions("class loading", "init()", "service()", "destroy()");
                mv = new ModelAndView("index");
                mv.addObject("url", "result.htm");
                mv.addObject("question", q4);
                mv.addObject("pageNumber",pageNumber);
                break;
            case("5"):
                result.addAnswer(request.getParameter("question"+(pageNumber-1)));
                session.setAttribute("result", result);
                mv = new ModelAndView("index");
                mv.addObject("pageNumber",pageNumber);
                break;
            default:
                break;
        }
        
        return mv;
    }
    
}
