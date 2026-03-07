// Last updated: 3/7/2026, 10:34:00 PM
class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int count=0;
        int suml=0;
        for(int i=0;i<nums.length-1;i++){
             suml+=nums[i];
            int sumr=sum-suml;
            if(Math.abs((sumr-suml))%2==0){
                count++;
            }
       }
       return count;

        
    }
}