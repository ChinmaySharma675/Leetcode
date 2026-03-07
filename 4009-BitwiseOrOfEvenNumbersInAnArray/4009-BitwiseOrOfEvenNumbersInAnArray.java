// Last updated: 3/7/2026, 10:33:48 PM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int or=0;
        for(int num:nums){
            if(num%2==0)  or=or|num; 
        }
        return or;
        
    }
}