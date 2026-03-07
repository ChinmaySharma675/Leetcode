// Last updated: 3/7/2026, 10:34:06 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> S =new HashSet<>();
        int[] k=new int[2];
        int j=0;
        for(int i=0;i<n;i++){
            if(!S.add(nums[i])){
                k[j]=nums[i];
                j++;
            }
        }
        return k;
    }
}