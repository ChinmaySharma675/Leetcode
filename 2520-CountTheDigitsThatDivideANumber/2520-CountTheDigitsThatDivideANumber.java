// Last updated: 9/23/2026, 1:30:15 PM
class Solution {
    public int countDigits(int num) {
        int k=num;
        int c=0;
        while(k!=0){
            int a=k%10;
            if(num%a==0){
                c++;
            }
            k/=10;
        }
        return c;
        
    }
}