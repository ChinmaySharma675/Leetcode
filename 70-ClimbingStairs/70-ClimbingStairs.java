// Last updated: 3/7/2026, 10:36:21 PM
class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int a=0;
        int b=1;
        int result=0;
        for(int i=0;i<n;i++){
            result=a+b;
            a=b;
            b=result;
        }
        return result;
    }
} 