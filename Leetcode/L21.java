package Leetcode;

public class L21 {  //時間複雜度：O(n)
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            } 
            else{
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            } 
            current = current.next;
        }
        if (l1 != null) current.next = l1;
        else current.next = l2;
        return dummy.next;
    }
}
