// Last updated: 3/7/2026, 10:36:16 PM
class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            } else{
                count--;
            }
            if(count>nums.length/2) return candidate;
        }
        return candidate;
    }
}