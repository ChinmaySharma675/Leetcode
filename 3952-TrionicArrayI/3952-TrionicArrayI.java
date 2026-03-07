// Last updated: 3/7/2026, 10:33:51 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        int c=0;
        int j=0;
        int i=0;

        int n=nums.length;
        if(nums.length<=3){
            return false;
        }
        if(nums[0]<nums[1] && nums[n-1]>nums[n-2]){
        while(c==0 &&i<=nums.length-2){
            if(nums[i]>nums[i+1]){
                c++;
            }
            if(nums[i]==nums[i+1]){
                return false;
            }
            j=i;
            i++;
        }
        while(c==1 && j<=nums.length-2){
            if(nums[j]<nums[j+1]){
                c++;
            }
             if(nums[j]==nums[j+1]){
                return false;
            }
            i=j;
            j++;
        }
        while(c==2 &&i<=nums.length-2){
            if(nums[i]>nums[i+1]){
                c++;
            }
             if(nums[i]==nums[i+1]){
                return false;
            }
            i++;
        }}
        if(c==2){
            return true;
        }
        return false;
        }
}