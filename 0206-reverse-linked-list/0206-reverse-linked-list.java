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
    public ListNode reverseList(ListNode head) {
         ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next; // Store next node
            head.next = prev;          // Reverse the link
            prev = head;               // Move prev forward
            head = temp;               // Move head forward
        }

        return prev;
    }
}