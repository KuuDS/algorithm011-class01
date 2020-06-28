/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode head = new ListNode();
        ListNode curNew = head;

        while (cur1 !=null && cur2 != null) {
            if (cur1.val > cur2.val) {
                curNew.next = cur2;
                curNew = cur2;
                cur2 = cur2.next;
            }  else {
                curNew.next = cur1;
                curNew = cur1;
                cur1 = cur1.next;
            }
        }

        if (cur1 != null) {
            curNew.next = cur1;
        }

        if (cur2 != null) {
            curNew.next = cur2;
        }
        return head.next;
     }
}