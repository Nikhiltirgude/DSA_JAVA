class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        // Step 1: Copy values into array
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i++] = temp.val;  // use val, not data
            temp = temp.next;
        }

        // Step 2: Sort array
        Arrays.sort(arr);

        // Step 3: Rebuild linked list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int val : arr) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        return dummy.next;
    }
}
