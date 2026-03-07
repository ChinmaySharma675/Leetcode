// Last updated: 3/7/2026, 10:34:02 PM
class Solution {
    public int smallestNumber(int n) {
       int a=n;
       while((a&(a+1))!=0){
        a++;
       }
    return a;
    }
}