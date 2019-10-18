package test;

import java.util.*;

public class Q017_Letter_Combinations_of_a_Phone_Number {
    Map<Character, String> phone = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    
    List<String> resultList = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            combine(0, digits.toCharArray(), "");
        return resultList;
    }
    
    public void combine(int location, char[] numbers, String result){
        if(location==numbers.length){
            resultList.add(result);
        }else {
        	String letters = phone.get(numbers[location]);
            for(int i=0;i<letters.length();i++){
                combine(location+1, numbers, result+letters.substring(i,i+1));
            }
        }
    }
}
