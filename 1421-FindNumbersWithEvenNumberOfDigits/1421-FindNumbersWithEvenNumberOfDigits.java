// Last updated: 3/7/2026, 10:35:29 PM
class Solution {
    public int findNumbers(int[] nums) {
        
        int d=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            while(nums[i]!=0){
                nums[i]/=10;
                c++;
            }
            if(c%2==0){
                d++;
            }
        }
        return d;
    }
    
}