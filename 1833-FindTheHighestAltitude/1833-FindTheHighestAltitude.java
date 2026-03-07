// Last updated: 3/7/2026, 10:35:03 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int[] b=new int[gain.length+1];
       int sum=0;
        for(int i=0;i<gain.length;i++){
            b[i]=sum+gain[i];
            sum=b[i];
            
        }
        //b[gain.length]=0;
        int max=b[0];
        for(int i=0;i<gain.length+1;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        return max;
    }
}