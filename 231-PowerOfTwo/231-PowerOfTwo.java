// Last updated: 3/7/2026, 10:36:11 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
       
       if(n<1){
        return false;
       }
        while(n%2==0){
            n/=2;
        }
      
        return n==1;  //if n is power of 2 the by continous divisin it should give 1 in end
    
}
}