// Last updated: 3/7/2026, 10:35:39 PM
class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
       int a=0;
       int b=1;
       int s=0;
       for(int i=1;i<n;i++){
        s=a+b;
        a=b;
        b=s;
       }
       return s;

    }
}