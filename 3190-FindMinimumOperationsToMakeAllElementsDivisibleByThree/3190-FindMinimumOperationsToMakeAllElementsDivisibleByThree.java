// Last updated: 9/23/2026, 1:29:02 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int num:nums){
            if(num%3!=0)count++;
        }
        return count;
    }
}