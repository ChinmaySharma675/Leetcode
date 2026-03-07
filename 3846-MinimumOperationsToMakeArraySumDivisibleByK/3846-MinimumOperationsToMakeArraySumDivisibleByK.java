// Last updated: 3/7/2026, 10:33:55 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum%k;
    }
}