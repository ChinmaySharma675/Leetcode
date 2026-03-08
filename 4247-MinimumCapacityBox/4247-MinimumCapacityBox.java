// Last updated: 3/8/2026, 8:48:25 PM
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int c=101;
        int index=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<c){
               c=capacity[i];
                index=i;
            }
        }
        return index;
    }
}