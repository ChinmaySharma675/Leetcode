// Last updated: 8/9/2026, 6:57:46 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int expected=1;
        for(int num:nums){
            if(num==expected){
                expected++;
            }
        }
        return expected;

    }
}