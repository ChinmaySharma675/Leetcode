// Last updated: 3/7/2026, 10:35:02 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        int c=0;
        for(int num:nums){
            int count=0;
            for(int num1:nums){
                if(num==num1){
                    count++;
                }
                
            }
            if(count==1){
                c+=num;
            }
            
        }
        return c;
    }
}