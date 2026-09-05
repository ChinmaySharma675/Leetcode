// Last updated: 9/5/2026, 7:28:18 PM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int or=0;
        for(int num:nums){
            if(num%2==0)  or=or|num; 
        }
        return or;
        
    }
}