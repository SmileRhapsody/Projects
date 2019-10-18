package test;

import java.util.HashMap;
import java.util.Map;

public class Q005_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
    	if(s.length()==0)
            return "";
        if(s.length()==1)
            return s;
        
        Map<Integer, int[]> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j))
                    continue;
                int start = i;
                int end = j;
                while(end-start>2 && s.charAt(start)==s.charAt(end)){
                    start++;
                    end--;
                }
                if(end-start<=2 && s.charAt(start)==s.charAt(end))
                    map.put(j-i, new int[]{i,j});
            }
        }
        
        if(map.isEmpty()){
            String s1 = "";
            s1+=s.charAt(0);
            return s1;
        }
        int max = 0;
        for(int i:map.keySet()){
            if(i>max)
                max = i;
        }
        int[] result = map.get(max);
        String ans="";
        for(int i=result[0];i<=result[1];i++)
            ans+=s.charAt(i);
        
        return ans;
    }	
}
