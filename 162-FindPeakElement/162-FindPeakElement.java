// Last updated: 8/9/2026, 6:57:09 PM
class Solution {
    public int findPeakElement(int[] nums) {
      int left=0;
      int right=nums.length-1;
      while(left<right){
        int mid=left+(right-left)/2;
        if(nums[mid]>nums[mid+1]){
            right=mid;
        }else{
            left=mid+1;
        }
      }
      return left;
    }
}