// Last updated: 3/13/2026, 2:55:20 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int left=0;
4        int right=nums.length-1;
5        while(left<right){
6            int mid=left+(right-left)/2;
7
8            if(nums[mid]>nums[right]){
9                left=mid+1;
10                
11                
12            }else{
13                right=mid;
14                
15            }
16        }
17        return nums[left];
18        
19    }
20}