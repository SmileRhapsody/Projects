package test;

import java.util.*;

public class Q008_String_to_Integer {
    public int myAtoi(String str) {
    	//ֱ����������
    	//str = str.trim();
    	
        if (str == null || str.length() == 0)
		    return 0;
        List<Character> list = new ArrayList<>();
        char[] charList = str.toCharArray();
        int begin = 0;
        int sign = 1;
        for(char c: charList){
            if(c==' ')
                begin++;
            else
                break;
        }
        if(begin==str.length())
        	return 0;
        if(charList[begin]=='-') {
        	sign = -1;
        	begin++;
        }else if(charList[begin]=='+') {
        	begin++;
        }
        if(begin==str.length())
        	return 0;
        for(int i = begin;i<charList.length;i++) {
        	if(Character.isDigit(charList[i])) {
        		list.add(charList[i]);
        		continue;
        	}else{
                break;
            }
        }
        System.out.println(list);
        long sum = 0;
        for(char c: list) {
        	sum=sum*10+Long.parseLong(c+"");
        	if (sign == 1 && sum > Integer.MAX_VALUE)
    			return Integer.MAX_VALUE;
    		if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
    			return Integer.MIN_VALUE;
        }
        return (int)sum*sign;
    }
}