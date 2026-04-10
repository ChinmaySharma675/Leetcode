// Last updated: 4/10/2026, 9:34:52 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int left=0,right=nums.length-1;
4        while(left<right){
5            int mid=left+(right-left)/2;
6
7            int count=0;
8            for(int num:nums){
9                if(num<=mid) count++;
10            }
11            if(count>mid){ right=mid;}
12           else left=mid+1;
13        }
14        return left;
15
16    }
17}