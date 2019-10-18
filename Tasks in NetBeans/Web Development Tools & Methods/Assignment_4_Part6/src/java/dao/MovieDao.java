/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pojo.Movie;

/**
 *
 * @author Administrator
 */
public class MovieDao {
    public List<Movie> getMovies(String keyword, String search) {
        Connection connection = null;
        List<Movie> result = null;
        try {
            Dao dao = new Dao();
            connection = dao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<Movie>> h = new BeanListHandler<Movie>(Movie.class);
            String query = "";
            switch (search) {
                case "title":
                    query = "select * from movies where title = ?";
                    break;
                case "actor":
                    query = "select * from movies where actor = ?";
                    break;
                case "actress":
                    query = "select * from movies where actress = ?";
                    break;
                default:
                    break;
            }
            result = queryRunner.query(connection, query, h, keyword);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }
    
    public int addMovie(String title, String actor, String actress, String genre, int year) {
        Connection connection = null;
        int result = 0;
        try {
            Dao dao = new Dao();
            connection = dao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query = "insert into movies (title, actor, actress, genre, year) values (?, ?, ?, ?, ?)";
            result = queryRunner.update(connection, query, title, actor, actress, genre, year);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return result;
    }
}
