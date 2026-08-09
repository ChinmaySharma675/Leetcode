// Last updated: 8/9/2026, 6:54:54 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        ArrayList<Integer> A=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            A.add(index[i],nums[i]);
        }
        for(int i=0;i<A.size();i++){
            target[i]=A.get(i);
        }
        return target;
    }
}