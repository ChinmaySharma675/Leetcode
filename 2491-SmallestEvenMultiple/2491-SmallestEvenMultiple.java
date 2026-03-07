// Last updated: 3/7/2026, 10:34:37 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        return n*2;
    }
}