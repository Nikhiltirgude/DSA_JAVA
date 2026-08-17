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
    public void reorderList(ListNode head) {
        ListNode middle=middleNode(head);

        //Reverse the second half
        ListNode second=reverse(middle.next);
        middle.next=null;

        //Merege two list
        ListNode first=head;

        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
        

    }

    private static ListNode middleNode(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    private static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev = null;
        ListNode right;

        while(curr!=null){
            right=curr.next;
            curr.next=prev;

            prev=curr;
            curr=right;
        }

        return prev;
    }
}