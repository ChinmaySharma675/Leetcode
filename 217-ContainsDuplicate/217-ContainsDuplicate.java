// Last updated: 3/7/2026, 10:36:12 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> S=new HashSet<>();
        for(int num:nums){
            if(!S.add(num)){
                return true;
            }
        }
        return false;
        
    }
}