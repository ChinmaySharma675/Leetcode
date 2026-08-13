// Last updated: 8/13/2026, 9:15:14 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3      int left=0;
4      int right=nums.length-1;
5      while(left<right){
6        int mid=left+(right-left)/2;
7        if(nums[mid]>nums[mid+1]){
8            right=mid;
9        }else{
10            left=mid+1;
11        }
12      }
13      return left;
14    }
15}