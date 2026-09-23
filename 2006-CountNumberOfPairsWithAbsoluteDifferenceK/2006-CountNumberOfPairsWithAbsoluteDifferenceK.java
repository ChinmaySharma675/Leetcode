// Last updated: 9/23/2026, 1:31:06 PM
class Solution {
    public int countKDifference(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    c++;
                }
        }
    }
    return c;
}
}