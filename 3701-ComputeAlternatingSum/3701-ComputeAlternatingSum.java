// Last updated: 9/5/2026, 7:28:11 PM
class Solution {
    public int alternatingSum(int[] nums) {
        int j=0;
        int k=1;
        int sum=0;
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            sum+=nums[i];
        } else{
            sum-=nums[i];
        }
       }
        return sum;
    }
}