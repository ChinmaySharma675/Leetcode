// Last updated: 8/9/2026, 6:56:44 PM
class Solution {
    public int[] countBits(int n) {
        int[] arr= new int[n+1];
        int j=0;
        int k=0;
        while(k<n+1){
        int b=Integer.bitCount(k);
        arr[j]=b;
        j++;
        k++;
        }

        return arr;
    }
}