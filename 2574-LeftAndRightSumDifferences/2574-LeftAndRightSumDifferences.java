// Last updated: 9/23/2026, 1:30:05 PM
class Solution {
        public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
        }
        int lsum=0;
        for(int i=0;i<n;i++){
           int rsum=sum-lsum-nums[i];
            arr[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return arr;

    }
}