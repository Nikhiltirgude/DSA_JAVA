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
    public ListNode deleteMiddle(ListNode head) {
         if( head ==null){
        return head;
    }

    ListNode prev = null;
    ListNode curr = head;
    int midIdx=0;
    ListNode temp=head;
    while(temp!=null){
        midIdx++;
        temp=temp.next;
    }
    int mid=midIdx/2;
    int count = 0;

    while(count != mid){
        prev = curr;
        curr = curr.next;
        count++;
    }

    if(prev == null){
       head = head.next;
    } 
    else{
        prev.next = curr.next;
    }
        
    return head;
}
}