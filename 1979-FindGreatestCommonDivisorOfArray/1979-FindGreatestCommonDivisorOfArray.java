// Last updated: 9/23/2026, 1:31:07 PM
class Solution {
    public int findGCD(int[] nums) {
        int b =nums[0];
        int a=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>a) a=nums[i];
            if(nums[i]<b) b=nums[i];}

            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
        return a;
    }
}