// Last updated: 8/9/2026, 6:50:43 PM
class Solution {
    public int firstUniqueEven(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int c=1;
            if(nums[i]%2==0){
                for(int j=0;j<nums.length;j++ ){
                    if(i!=j && nums[i]==nums[j]){
                        c++;
                    }
                }
                if(c==1) return nums[i];
            }
            
        }
        return -1;
        
    }
}