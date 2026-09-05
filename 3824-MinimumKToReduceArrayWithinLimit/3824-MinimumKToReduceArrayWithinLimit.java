// Last updated: 9/5/2026, 7:27:40 PM
class Solution {
    public int minimumK(int[] nums) {
        int start=1; //smallest possible k
        int end=1_000_000_000;
        
        // using binary search
        while(start<end){
            int mid=start + (end-start)/2;
            long nP=0;
            for(int num:nums){
                nP+= (num +mid -1)/mid; //ceil division..gives ceil in int format
            }
            if(nP <= (long) mid*mid){
                end=mid; //mid works ,try smaller k
            } 
            else{
                start=mid+1; //mid too small, needs bigger k
            }
                
            }
        
    return start;
      }
}
