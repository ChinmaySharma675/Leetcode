// Last updated: 3/7/2026, 10:35:22 PM
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int t=0;
       for(int x:arr1){
        int c=0;
       
        for(int y:arr2){
            if(Math.abs(x-y) <= d){
                c++;
                break;
            } 
        }
        if(c==0){
            t++;
        }
       }
    return t;
    }
}