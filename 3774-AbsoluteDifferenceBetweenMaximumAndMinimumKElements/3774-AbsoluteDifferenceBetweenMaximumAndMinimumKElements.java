// Last updated: 9/5/2026, 7:27:45 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum1=0;
        int sum2=0;
        for(int i=0;i<k;i++){
            sum2+=nums[i];
        }
        for(int i=nums.length-1;i>nums.length-k-1;i--){
            sum1+=nums[i];
        }
        return sum1-sum2;
    }
}