// Last updated: 8/16/2026, 11:14:04 PM
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
13        List<Integer> a=new ArrayList<>();
14
15        while(head!=null){
16            a.add(head.val);
17            head=head.next;
18        }
19        
20        int[] ans=new int[a.size()];// all elemetns of a array are 0 before they are assigned values specifically.
21
22       for(int i=0;i<a.size();i++){
23        for(int j=i+1;j<a.size();j++){
24            if(a.get(j)>a.get(i)){
25                ans[i]=a.get(j);
26                break;
27            }
28        }
29       }
30
31        return ans;
32    }
33}