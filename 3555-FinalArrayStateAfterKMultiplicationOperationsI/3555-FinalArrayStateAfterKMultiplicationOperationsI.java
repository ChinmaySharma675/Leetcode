// Last updated: 3/7/2026, 10:34:07 PM
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

     while(k!=0){
        int min=nums[0];
        int g=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                g=i;
            }
        }
        nums[g]=min*multiplier;
        k--;

     }   

     return nums;
    }

}