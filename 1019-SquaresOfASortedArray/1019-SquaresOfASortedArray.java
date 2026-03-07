// Last updated: 3/7/2026, 10:35:38 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
    
        int[] A1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            A1[i]=nums[i]*nums[i];
            
        }
        Arrays.sort(A1);
        return A1;
    }
}