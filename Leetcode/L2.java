package Leetcode;

public class L2 {   //時間複雜度：O(n)
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum >= 10 ? 1 : 0;
            current.next = new ListNode(sum % 10);  //加總值
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (carry == 1) current.next = new ListNode(1);  //進位值
        }       
        return dummy.next;
    }
}
