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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(101);
        ListNode current = result;

        while (head != null) {
            if (current.val != head.val) {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }

        return result.next;
    }
}