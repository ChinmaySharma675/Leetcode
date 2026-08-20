// Last updated: 8/20/2026, 9:52:57 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        k=k%n;
5        int c=0;
6        int start=0;
7
8        while(c<n){
9            int curr=start;
10            int temp=nums[curr];
11
12            while(true){
13                int next=(curr+k)%n;
14                int nextemp=nums[next];
15                nums[next]=temp;
16                temp=nextemp;
17
18                curr=next;
19                c++;
20
21                if(curr==start)break;
22                
23            }
24            start++;
25        }
26    }
27}