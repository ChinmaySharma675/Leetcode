// Last updated: 9/23/2026, 1:28:43 PM
class Solution {
    public int smallestNumber(int n) {
       int a=n;
       while((a&(a+1))!=0){ //loops break when a&(a+1)==0 which haapens only when a has all sets equal to 1.
        a++;
       }
    return a;
    }
}
