// Last updated: 9/23/2026, 1:28:47 PM
class Solution {
    public int smallestNumber(int n, int t) {
        for(int j=n; ;j++){
            int i=j;
            int p=1;
            while(i!=0){
                p*=i%10;
                i/=10;
            }
            if(p%t==0){
                return j;
            }
        }
    
    }
}