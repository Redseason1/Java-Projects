package Leetcode;

public class L83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for ( ; head != null; head = head.next) {   
            if (current == dummy || head.val != current.val) {  //去除重複
                current.next = head;
                current = current.next;
            }
        }
        current.next = null;
        return dummy.next;
    }
}
