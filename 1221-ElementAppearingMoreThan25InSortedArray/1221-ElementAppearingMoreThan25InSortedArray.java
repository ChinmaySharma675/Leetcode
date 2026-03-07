// Last updated: 3/7/2026, 10:35:34 PM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int m=arr.length/4;
        int k=arr[0];
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                c++;
                
            }else{
                k=arr[i];
                c=1;
            }
            if(c>m) return k;
            
        }
        return -1;
        
    }
}