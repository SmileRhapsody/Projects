/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Result {
    List<String> result;
    
    public Result(){
        result = new ArrayList<>();
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }
    
    public void addAnswer(String s){
        result.add(s);
    }
}
