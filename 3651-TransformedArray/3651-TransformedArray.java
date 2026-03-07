// Last updated: 3/7/2026, 10:34:03 PM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int a=(i+Math.abs(nums[i]))%n;
                result[i]=nums[a];
            }else if(nums[i]<0){
                int a = (i - Math.abs(nums[i])) % n;
                if (a < 0) {
                    a += n;
                }
                result[i] = nums[a];
            }else{
                result[i]=nums[i];
            }
        }
        return result;
    }
}