// Last updated: 3/7/2026, 10:36:29 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> L =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                L.add(i);
            }
        }
        if(L.isEmpty()){
            return new int[] {-1,-1};
        }
        int max=Collections.max(L);
        int min=Collections.min(L);
    
        return new int[] {min,max};
        
        
    }
}