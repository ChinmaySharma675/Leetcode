// Last updated: 8/16/2026, 12:35:40 PM
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
12    public ListNode removeElements(ListNode head, int val) {
13        ListNode Lnew= new ListNode(0);
14        Lnew.next=head;
15
16        ListNode prev=Lnew;
17        ListNode curr=head;
18
19        while(curr!=null){
20            if(curr.val==val){
21                prev.next=curr.next;
22            }else{
23                prev=curr;
24            }
25            curr=curr.next;
26        }
27        return Lnew.next;
28    }
29}