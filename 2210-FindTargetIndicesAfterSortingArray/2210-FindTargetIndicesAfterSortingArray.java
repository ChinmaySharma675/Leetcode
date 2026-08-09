// Last updated: 8/9/2026, 6:53:30 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> L=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                L.add(i);
            }
            if(nums[i]>target) {
                return L;
            }
        }
        return L;
    }
}