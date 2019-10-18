/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Business.Movie;
import Business.MovieDao;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class Part7 extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        response.setContentType("text/html");
        
        String keyword = request.getParameter("keyword");
        String search = request.getParameter("searchBy");
        
//        List<Movie> movieList = new ArrayList<>();
//        Connection connection = null;
//        Statement stm = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info6250?serverTimezone=UTC", "root", "123456");
//            stm = connection.createStatement();
//            String query = "select * from movies";
//            switch (search) {
//                case "title":
//                    query = "select * from movies where title = '" + keyword + "'";
//                    break;
//                case "actor":
//                    query = "select * from movies where actor = '" + keyword + "'";
//                    break;
//                case "actress":
//                    query = "select * from movies where actress = '" + keyword + "'";
//                    break;
//                default:
//                    break;
//            }
//            ResultSet results = stm.executeQuery(query);
//            while (results.next()) {
//                Movie movie = new Movie(results.getString(1),results.getString(2),
//                        results.getString(3),results.getString(4),results.getString(5));
//                movieList.add(movie);
//            }
//            results.close();
//            stm.close();
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        request.setAttribute("movieList", movieList);
//        request.setAttribute("keyword", keyword);

        MovieDao moviedao = new MovieDao();
        List<Movie> movieList = moviedao.getMovies(keyword, search);
        request.setAttribute("movieList", movieList);
        request.setAttribute("keyword", keyword);
        
        request.getRequestDispatcher("part7_view.jsp").forward(request, response);
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        response.setContentType("text/html");
        
        String title = request.getParameter("title");
        String actor = request.getParameter("actor");
        String actress = request.getParameter("actress");
        String genre = request.getParameter("genre");
        String year = request.getParameter("year");
        String show = "";
        
//        Connection connection = null;
//        Statement stm = null;
//        String title = "";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info6250?serverTimezone=UTC", "root", "123456");
//            stm = connection.createStatement();
//            String query = "INSERT INTO movies (title, actor, actress, genre, year) VALUES ('" 
//                    + title + "', '" + actor + "', '" + actress + "', '" + genre + "', '" + year + "');";
//            int result = stm.executeUpdate(query);
//            if (result > 0) {
//                show="1 Movie Added Successfully";
//            }
//            stm.close();
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        request.setAttribute("show", show);
//        request.getRequestDispatcher("part7_success.jsp").forward(request, response);
        try{
            int y = Integer.parseInt(year);
        }catch(Exception e){
            request.getRequestDispatcher("part7_add.jsp").forward(request, response);
        }
        if(title.isEmpty()||actor.isEmpty()||genre.isEmpty()||actress.isEmpty()){
            request.getRequestDispatcher("part7_add.jsp").forward(request, response);
        }else{
            MovieDao moviedao = new MovieDao();
            int result = moviedao.addMovie(title, actor, actress, genre, Integer.parseInt(year));
            if(result == 1){
                show = "1 Movie Added Successfully";
                request.setAttribute("show", show);
                request.getRequestDispatcher("part7_success.jsp").forward(request, response);
            }else{
                show = "Added failed";
                request.setAttribute("show", show);
                request.getRequestDispatcher("part7_success.jsp").forward(request, response);
            }
        }
    }
}
