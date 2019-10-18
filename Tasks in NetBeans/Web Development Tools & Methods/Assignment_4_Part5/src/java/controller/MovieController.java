/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MovieDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import pojo.Movie;

/**
 *
 * @author Administrator
 */
public class MovieController extends AbstractController {
    
    public MovieController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        ModelAndView mv = null;
        String page = request.getParameter("page") == null ? "0" : request.getParameter("page");
        MovieDao movieDao = new MovieDao();
        
        switch (page) {
            case "home":
                String selection = request.getParameter("selection");
                if (selection.equals("add")) {
                    mv = new ModelAndView("add");
                } else if (selection.equals("browse")) {
                    mv = new ModelAndView("browse");
                }
                break;
            case "add":
                String title = request.getParameter("title");
                String actor = request.getParameter("actor");
                String actress = request.getParameter("actress");
                String genre = request.getParameter("genre");
                String year = request.getParameter("year");
                
                try{
                    int y = Integer.parseInt(year);
                if(title.isEmpty()||actor.isEmpty()||genre.isEmpty()||actress.isEmpty()){
                    mv = new ModelAndView("add");
                }else{
                
                int result = movieDao.addMovie(title, actor, actress, genre, Integer.parseInt(year));
                String show="";
                if(result == 1){
                    show = "1 Movie Added Successfully";
                }else{
                    show = "Added failed";
                }
                mv = new ModelAndView("success");
                mv.addObject("show", show);
                
                }
                }catch(NumberFormatException e){
                    mv = new ModelAndView("add");
                }
                break;
            case "browse":
                String keyword = request.getParameter("keyword");
                String search = request.getParameter("searchBy");
                List<Movie> movieList = movieDao.getMovies(keyword, search);
                mv = new ModelAndView("view");
                mv.addObject("keyword", keyword);
                mv.addObject("movieList", movieList);
                break;
            default:
                mv = new ModelAndView("index");
                break;
        }
        return mv;
    }
    
}
