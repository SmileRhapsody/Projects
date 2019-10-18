package test;

import java.util.*;

import javax.lang.model.element.Element;

class ListNode{ 
	int val; 
	ListNode next; 
	ListNode(int val){ 
		this.val=val; 
		this.next=null; 
	}
}

public class Q002_Add_Two_numbers {
	public ListNode addTwoNumbers() {
	    ListNode l1=buildListNode(new int[]{1,2,3});
	    ListNode l2=buildListNode(new int[]{3,9,6});
		
	    ListNode list =new ListNode(0);
	    ListNode newcode=list;
	    int carry = 0;
	    while(l1!=null || l2!=null) {
	    	int a = (l1!=null)? l1.val:0;
	    	int b = (l2!=null)? l2.val:0;
	    	int sum = a+b+carry;
	    	carry = sum/10;
	    	newcode.next = new ListNode(sum%10);
	    	newcode = newcode.next;
	    	l1=(l1!=null)? l1.next:null;
	    	l2=(l2!=null)? l2.next:null;
	    }
	    
	    if(carry>0)
	    	newcode.next = new ListNode(carry);
	    
	    ListNode test = list.next;
	    while(test!=null) {
	    	System.out.print(test.val);
	    	test=test.next;
	    }
	    
	    return list.next;
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
}

