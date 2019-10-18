package test;

import java.util.*;

public class Q771_Jewels_and_Stones {
	public int numJewelsInStones(String J, String S) {
        List<Character> jList = new ArrayList<>();
        for(char c:J.toCharArray())
            jList.add(c);
        int count = 0;
        for(char c : S.toCharArray()){
            if(jList.contains(c))
                count++;
        }
        return count;
    }
}
