// Last updated: 3/7/2026, 10:34:12 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int p=0;
        Set<Integer> S=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!S.add(nums[i])){
                p^=nums[i];

            }
        }
        return p;
        
    }
}