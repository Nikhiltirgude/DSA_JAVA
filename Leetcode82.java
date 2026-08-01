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

        while (head != null && head.next != null && head.val == head.next.val) {
            int dupVal = head.val;
            while (head != null && head.val == dupVal) {
                head = head.next; // skip all duplicates of head
            }
        }
        ListNode prev = head;
        ListNode curr = head;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int dupVal = curr.val;
                while (curr != null && curr.val == dupVal) {
                    curr = curr.next; // skip duplicates
                }
                prev.next = curr; // link to next distinct node
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}