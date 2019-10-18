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
public class Question {
    String title;
    List<String> optionList;
    
    public Question(){
        optionList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<String> optionList) {
        this.optionList = optionList;
    }
    
    public void addOptions(String s1, String s2, String s3, String s4){
        optionList.add(s1);
        optionList.add(s2);
        optionList.add(s3);
        optionList.add(s4);
    }
}
