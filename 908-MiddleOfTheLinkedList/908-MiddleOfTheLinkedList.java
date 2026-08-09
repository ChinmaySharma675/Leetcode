// Last updated: 8/9/2026, 6:55:43 PM
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
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;//slow moves 1 node at a time
            fast=fast.next.next;//fast moves 2 nodes at a time
            //by the time fast reaches end of list, slow is in middle ..and for even no. it gives 2nd middle
        }
        return slow; 
    }
}