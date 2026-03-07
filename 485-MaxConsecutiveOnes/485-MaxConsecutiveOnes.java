// Last updated: 3/7/2026, 10:36:02 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        int k=0;
        int[] b=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
                b[i]=k;
            }
            else{
                k=0;
                b[i]=k;
            }
        }
         int m=b[0];
        for(int i=0;i<b.length;i++){
            if(b[i]>m){
                m=b[i];
            }
        }
        return m;
    }
}