package test;

import java.util.*;

public class Q049_Group_Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        String[] temp = new String[strs.length];
        for(int i=0;i<strs.length;i++){
            char[] cs = strs[i].toCharArray();
            Arrays.sort(cs);
            temp[i] = String.valueOf(cs);
        }

        Map<String, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i<temp.length;i++){
            if(!map.containsKey(temp[i])){
                List<Integer> intList = new ArrayList<>();
                intList.add(i);
                map.put(temp[i],intList);
            }else{
                map.get(temp[i]).add(i);
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        for(List<Integer> l: map.values()){
            List<String> sl = new ArrayList<>();
            for(int i:l){
                sl.add(strs[i]);
            }
            result.add(sl);
        }
        return result;
    }
	
	public List<List<String>> groupAnagrams1(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
