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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode midIdx=head;
        while(midIdx!=null){
            count++;
            midIdx=midIdx.next;
        }
        int mid=count/2;
        ListNode temp=head;
        while(mid>0){
            temp=temp.next;
            mid--;
        }
        
        return temp;
        
    }
}