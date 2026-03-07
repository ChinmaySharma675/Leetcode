// Last updated: 3/7/2026, 10:34:40 PM
class Solution {
    public int countPairs(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    c++;
                }
            }
        }
        return c;
    }
}