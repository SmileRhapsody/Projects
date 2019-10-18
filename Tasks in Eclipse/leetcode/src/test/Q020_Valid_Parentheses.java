package test;

import java.util.*;

public class Q020_Valid_Parentheses {
	public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
		Map<Character,Character> map = new HashMap<>();
		map.put(']', '[');
		map.put('}', '{');
		map.put(')', '(');
		
		for(char c: s.toCharArray()) {
			if(map.values().contains(c)){
                list.add(c);
                continue;
            }
			if(map.keySet().contains(c) && list.size()!=0) {
				if(list.get(list.size()-1)!=map.get(c))
					return false;
				else
					list.remove(list.size()-1);
			}else
                return false;
		}
		
		if(list.size()==0)
			return true;
		else
			return false;
	}
	
// 2rn Solution
	
	private HashMap<Character, Character> mappings;
	
	public Q020_Valid_Parentheses() {
	    this.mappings = new HashMap<Character, Character>();
	    this.mappings.put(')', '(');
	    this.mappings.put('}', '{');
	    this.mappings.put(']', '[');
	  }

	  public boolean isValid2(String s) {

	    // Initialize a stack to be used in the algorithm.
	    Stack<Character> stack = new Stack<Character>();

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);

	      // If the current character is a closing bracket.
	      if (this.mappings.containsKey(c)) {

	        // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
	        char topElement = stack.empty() ? '#' : stack.pop();

	        // If the mapping for this bracket doesn't match the stack's top element, return false.
	        if (topElement != this.mappings.get(c)) {
	          return false;
	        }
	      } else {
	        // If it was an opening bracket, push to the stack.
	        stack.push(c);
	      }
	    }

	    // If the stack still contains elements, then it is an invalid expression.
	    return stack.isEmpty();
	  }
}
