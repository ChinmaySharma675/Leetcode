// Last updated: 3/7/2026, 10:34:43 PM
class Solution {
    public int smallestEqual(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                return i;
            }
        }
        return -1;
        
    }
}