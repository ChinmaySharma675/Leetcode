// Last updated: 9/23/2026, 1:30:31 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        return n*2;
    }
}