// Last updated: 3/7/2026, 10:36:35 PM
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        if(x<0) return false;
        int k=x;
        while(x!=0){
            int a=x%10;
            rev=rev*10+a;
            x/=10;
        }
        return k==rev;
    }
}