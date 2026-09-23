// Last updated: 9/23/2026, 1:30:09 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int k=nums[i];
            while(k!=0){
                int a=k%10;
                sum1+=a;
                k/=10;
            }
        }
        return Math.abs(sum-sum1);
    }
}