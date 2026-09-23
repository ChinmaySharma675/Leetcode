// Last updated: 9/23/2026, 1:29:16 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int a=x;
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
        
    }
}