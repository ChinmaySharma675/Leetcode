// Last updated: 3/7/2026, 10:35:40 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
       Set<Integer> set=new HashSet<>();

       for(int i:nums){
        if(set.contains(i)){
            return i;
        }
        set.add(i);
        
       }

        return 1;
    }
}