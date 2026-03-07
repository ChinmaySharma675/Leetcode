// Last updated: 3/7/2026, 10:34:10 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int num:nums){
            if(num%3!=0)count++;
        }
        return count;
    }
}