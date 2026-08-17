// Last updated: 8/17/2026, 8:16:42 PM
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
12    public ListNode swapNodes(ListNode head, int k) {
13        ListNode fast=head;
14        for(int i=1;i<k;i++){
15            fast=fast.next;
16        }
17
18        ListNode first=fast;
19        ListNode slow=head;
20
21        while(fast.next!=null){
22            fast=fast.next;
23            slow=slow.next;
24        }
25
26        ListNode second = slow;
27        int temp=first.val;
28        first.val=second.val;
29        second.val=temp;
30
31        return head;
32        
33    }
34}