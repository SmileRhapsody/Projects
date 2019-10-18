package test;

import java.util.*;

public class Q141_Linked_List_Cycle {
	public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            if(!list.contains(temp)){
                list.add(temp);
                temp=temp.next;
            }else{
                return true;
            }
        }
        return false;
    }
}
 