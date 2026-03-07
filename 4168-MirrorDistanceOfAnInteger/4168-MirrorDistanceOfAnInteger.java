// Last updated: 3/7/2026, 10:33:40 PM
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int a=n;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return Math.abs(a-rev);
    }
}