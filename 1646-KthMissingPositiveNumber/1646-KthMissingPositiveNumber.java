// Last updated: 8/9/2026, 6:54:29 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=1;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=start){
                for(int j=start;j<arr[i];j++){
                 c++;
                if(c==k)return j;
             
                }
            }
            start=arr[i]+1;
        }
        return start+k-c-1;
    }
}