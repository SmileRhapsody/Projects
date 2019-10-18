package test;

import java.util.*;

public class Q206_Reverse_Linked_List {
	public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        List<Integer> list = new ArrayList<>();
        list = buildList(head, list);
        Collections.reverse(list);
        return buildListNode(list);
    }
    
    private static List<Integer> buildList(ListNode l, List<Integer> list){
    	if(l!=null)
            list.add(l.val);
        if(l.next!=null) 
            buildList(l.next, list);
        return list;
    }
    
    private static ListNode buildListNode(List<Integer> list){
        ListNode first=null, last=null;
        for(int i:list){
            if(first==null){
                first=new ListNode(i);
                last = first;
            }else{
                last.next=new ListNode(i);
                last=last.next;
            }
        }
        return first;
    }
    
    
// 2nd Solution
    public ListNode reverseList2(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    
//	3rd Solution
// 链表是可以转回去的
    public ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
