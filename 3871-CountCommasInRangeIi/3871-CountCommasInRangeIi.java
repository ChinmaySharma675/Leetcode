// Last updated: 9/5/2026, 7:27:09 PM
class Solution {
    public long countCommas(long n) {
        long commas=0;
        for(long start=1;start<=n;start*=10){
            long end=start*10-1;
            long right=Math.min(n,end);
            int digits=String.valueOf(start).length();
            int c=(digits-1)/3;
            if(c>0){
                commas+=(right-start+1)*c;
            }
            
        }
        return commas;
    }
}