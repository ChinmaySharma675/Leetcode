// Last updated: 3/7/2026, 10:34:33 PM
class Solution {
    public int pivotInteger(int n) {
        int sum2=n*(n+1)/2; //total sum till number n.
       
        for(int i=1;i<=n;i++){
            
            int sum1=i*(i+1)/2; //sum1= sum till i so that we can check if i is pivot or not.
            if(sum1== (sum2-sum1+i)){ //sum2-sum1 +i=right side sum including pivot no. 
                return i;
            }

        }
       
        return -1;
        
    }
}