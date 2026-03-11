// Last updated: 3/11/2026, 6:16:26 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode middleNode(ListNode head) {
13        ListNode slow=head;
14        ListNode fast=head;
15
16        while(fast!=null && fast.next!=null){
17            slow=slow.next;//slow moves 1 node at a time
18            fast=fast.next.next;//fast moves 2 nodes at a time
19            //by the time fast reaches end of list, slow is in middle ..and for even no. it gives 2nd middle
20        }
21        return slow; 
22    }
23}