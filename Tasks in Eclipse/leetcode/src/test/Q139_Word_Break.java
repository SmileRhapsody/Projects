package test;

import java.util.*;

public class Q139_Word_Break {
	boolean result = false;

    public boolean wordBreak(String s, List<String> wordDict) {
        test(0,s,wordDict);
        return result;
    }
    
    public void test(int begin, String s,List<String> wordDict){
        if(begin==s.length())
            result = true;
        for(int i=begin;i<s.length();i++){
            if(wordDict.contains(s.substring(begin,i+1))){
                test(i+1,s,wordDict);
            }
        }
    }
}
