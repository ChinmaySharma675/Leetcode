// Last updated: 8/24/2026, 3:15:26 PM
1class Solution {
2    public double myPow(double x, int n) {
3        return power(x,(long)n);
4    }
5    public static double power(double x,long N){
6        if(N==0) return 1;
7        if(N<0) return 1/power(x,-N);
8        double half=power(x,N/2);
9        if(N%2==0) return half*half;
10        return x*half*half;
11    }
12}
13