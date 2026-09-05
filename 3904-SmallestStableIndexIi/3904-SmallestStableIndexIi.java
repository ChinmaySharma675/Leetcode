// Last updated: 9/5/2026, 7:26:44 PM
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        if(n==0) return -1;

        int[] min=new int[n];
        min[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            min[i]=Math.min(nums[i],min[i+1]);
        }
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }

            int score=max-min[i];
            if(score<=k) return i;
        }
        return -1;
    }
}