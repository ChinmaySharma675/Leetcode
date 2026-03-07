// Last updated: 3/7/2026, 10:36:03 PM
class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        int i=0;
        int sum=n;
        while(sum-i>=0){
            sum-=i;
            c++;
            i++;
        }
        return i-1;
    }
}