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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // length function 
        int size = length(head);

        if (k % size == 0) {
            return head;
        }

        k = k % size;
        int move = size - k;

        int count = 1;
        ListNode temp = head;

        // move to new tail
        while (count < move) {
            temp = temp.next;
            count++;
        }

        ListNode right = temp.next;
        temp.next = null; // break

        // go to end of right part
        ListNode temp2 = right;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }

        temp2.next = head; // connect

        return right;
    }

    // separate method
    public int length(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}