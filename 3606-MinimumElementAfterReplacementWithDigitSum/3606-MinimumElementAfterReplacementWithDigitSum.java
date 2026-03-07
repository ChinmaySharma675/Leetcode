// Last updated: 3/7/2026, 10:34:05 PM
class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int b=nums[i];
            int sum=0;
            while(b!=0){
                sum+=b%10;
                b/=10;
            }
            nums[i]=sum;
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
        
    }
}