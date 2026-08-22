// Last updated: 8/22/2026, 7:14:57 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum=0;
4        int p=1;
5        int k=n;
6        while(n!=0){
7            int a=n%10;
8            sum+=a;
9            p*=a;
10            n/=10;
11        }
12        int s=sum+p;
13        if(k%s==0){
14            return true;
15        } else return false;
16        
17    }
18}