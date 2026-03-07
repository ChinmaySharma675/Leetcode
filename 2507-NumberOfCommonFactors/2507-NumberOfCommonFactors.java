// Last updated: 3/7/2026, 10:34:35 PM
class Solution {
    public int commonFactors(int a, int b) {
        int min=Math.min(a,b);
        int c=0;      
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0) c++;
        }
        return c;
        
    }
}