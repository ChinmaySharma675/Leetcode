// Last updated: 9/23/2026, 1:30:46 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
       
       for(int num:nums){
        if(num==original){
            return findFinalValue(nums,original*2);
        }
        
    
    }
    return original;
}
}