// Last updated: 8/16/2026, 11:10:26 PM
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
12    public int[] nextLargerNodes(ListNode head) {
13        List<Integer> values=new ArrayList<>();
14
15        while(head!=null){
16            values.add(head.val);
17            head=head.next;
18        }
19        int n=values.size();
20        int[] ans=new int[n];
21
22        Stack<Integer> stack=new Stack<>();
23
24        for(int i=0;i<n;i++){
25            while(!stack.isEmpty() && values.get(stack.peek())< values.get(i)){
26                ans[stack.pop()]= values.get(i);
27            }
28            stack.push(i);
29        }
30        return ans;
31    }
32}