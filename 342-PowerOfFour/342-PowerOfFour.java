// Last updated: 3/7/2026, 10:36:09 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        while(n%4==0){
            n/=4;

        }

        return n==1;
    }
}