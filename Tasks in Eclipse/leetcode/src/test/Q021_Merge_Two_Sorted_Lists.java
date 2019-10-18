package test;

import java.util.*;

public class Q021_Merge_Two_Sorted_Lists {
	public void mergeTwoLists() {
		ListNode l1=buildListNode(new int[]{1,2,4});
	    ListNode l2=buildListNode(new int[]{1,3,4});
		
	    List<Integer> intList = new ArrayList<>();
        while(l1!=null){
            intList.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            intList.add(l2.val);
            l2=l2.next;
        }
        Collections.sort(intList);
        
        ListNode first = null,last = null;
        if(intList.size()>0){
	        for(int i:intList){
	            if(first==null){
	                first=new ListNode(i);
	                last=first;
	            }else{
	                last.next=new ListNode(i);
	                last=last.next;
	            }
	        }
	    }
        show(first);
    }
	
	private static ListNode buildListNode(int[] input){
		ListNode first = null,last = null,newNode;
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
	
//	2nd Solution
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

		 if(l1==null) return l2;
		 if(l2==null) return l1;
		 
		 ListNode head = null;
		 if(l1.val < l2.val){
		     head = l1;
		     head.next = mergeTwoLists2(l1.next,l2);
		 }else{
		     head = l2;
		     head.next = mergeTwoLists2(l1,l2.next);
		 }
		 return head;
		}
	
	public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode result = new ListNode(0), temp = result;
        while(l1!=null||l2!=null){
            if(l1==null){
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            }else if(l2 ==null){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next;
            }else if(l1.val<=l2.val){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next; 
            }else{
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            }
        }
        return result.next;
    }
}
