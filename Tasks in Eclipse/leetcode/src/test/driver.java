package test;

import java.util.List;

public class driver {
	public static void main(String[] args) {
		Q017_Letter_Combinations_of_a_Phone_Number t1 = new Q017_Letter_Combinations_of_a_Phone_Number();
		//char[][] grid= {{'1','1','1','0'},{'1','1','0','0'},{'0','0','0','1'},{'0','0','0','1'}};
		//char[][] grid2= {{'1','0','0','0'},{'0','0','0','1'},{'0','0','0','1'},{'0','1','0','0'}};
		//System.out.println(t1.myAtoi("9223372036854775808"));
		String s = "123123";
		System.out.println(s.substring(1,2));

	}
	
	private static ListNode buildListNode(int[] input){
		ListNode first = null,last = null,newNode;
	    int num;
	    if(input.length>0){
	        for(int i=0;i<input.length;i++){
	            newNode=new ListNode(input[i]);
	            newNode.next=null;
	            if(first==null){
	                first=newNode;
	                last=newNode;
	            }
	            else{
	                last.next=newNode;
	                last=newNode;
	            }

	        }
	    }
	    return first;
	}
	
	private static int show(ListNode l) {
		System.out.println(l.val);
		if(l.next!=null)
			show(l.next);
		return l.val;
	}
}
