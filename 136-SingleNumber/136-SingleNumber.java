// Last updated: 3/7/2026, 10:36:19 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums){
            result^=num; //xor with itself gives 0 and with 0 gives the number back..so duplicates cancel each other leaving the only single no.
        }
        
    return result;
        
    }
}