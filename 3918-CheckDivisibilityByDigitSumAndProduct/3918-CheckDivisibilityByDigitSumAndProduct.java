// Last updated: 3/7/2026, 10:33:53 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int k=n;
        while(n!=0){
            int a=n%10;
            sum+=a;
            p*=a;
            n/=10;
        }
        int s=sum+p;
        if(k%s==0){
            return true;
        } else return false;
        
    }
}