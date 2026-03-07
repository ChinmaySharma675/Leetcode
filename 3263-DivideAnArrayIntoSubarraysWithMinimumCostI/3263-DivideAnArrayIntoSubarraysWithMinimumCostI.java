// Last updated: 3/7/2026, 10:34:16 PM
class Solution {
    public int minimumCost(int[] nums) {
    int min1=51;
    int min2=51;
    int k=0;
    for(int i=1;i<nums.length;i++){
        if(nums[i]<=min1){
            min1=nums[i];
            k=i;

        }
    }
      for(int i=1;i<nums.length;i++){
        if(nums[i]<=min2 && i!=k){
            min2=nums[i];
        }
    }
    return nums[0]+min1+min2;
        
    }
}