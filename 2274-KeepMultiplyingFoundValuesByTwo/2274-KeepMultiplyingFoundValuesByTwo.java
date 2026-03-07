// Last updated: 3/7/2026, 10:34:41 PM
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