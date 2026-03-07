// Last updated: 3/7/2026, 10:35:18 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i+=2){
            arr[i]=nums[j];
            arr[i+1]=nums[j+n];
            j++;
        }
        return arr;
    }
}