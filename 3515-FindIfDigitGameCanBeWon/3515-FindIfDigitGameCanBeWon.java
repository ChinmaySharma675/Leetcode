// Last updated: 3/7/2026, 10:34:08 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9) ssum+=nums[i];
            else dsum+=nums[i];

        }
        if(dsum!=ssum) return true; //dsum!=ssum means one sum of the both is greater than other .

        return false;
        
    }
}