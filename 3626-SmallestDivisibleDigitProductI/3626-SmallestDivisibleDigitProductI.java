// Last updated: 3/7/2026, 10:34:04 PM
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