// Last updated: 3/7/2026, 10:34:14 PM
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