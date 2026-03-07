// Last updated: 3/7/2026, 10:35:48 PM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            int count = Integer.bitCount(i);
            int d=0;
            if(count<=1 )continue; //0 and 1 are not prime
            for(int j=2;j*j<=count;j++){
                if(count%j==0){
                    d++;
                    break;

                }
                
            }
            if(d==0){

               c++; 
            }
        }
        return c;
        
    }
}