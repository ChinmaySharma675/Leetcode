// Last updated: 3/7/2026, 10:33:44 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> S=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            S.add(nums[i]);
        }
        boolean B=true;
        int l=k;
        while(B){
            if(S.add(l)){
                B=false;
                return l;
                
            }
            l+=k;
        }
        return -1;
    }
}