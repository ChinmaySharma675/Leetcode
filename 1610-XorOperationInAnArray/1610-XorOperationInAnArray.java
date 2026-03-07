// Last updated: 3/7/2026, 10:35:15 PM
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int X=0;
        for(int i=0;i<n;i++){
            nums[i]=start + 2*i;
            X^=nums[i];
        }
        return X;
    }
}