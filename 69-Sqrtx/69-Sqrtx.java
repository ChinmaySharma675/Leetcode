// Last updated: 3/7/2026, 10:36:22 PM
class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x/2;
        int ans=0;
        if(x<2){
            return x;
        }
            
            while(start<=end){
                int mid=start+ (end-start)/2;
                long sq=(long) mid*mid;
                if(sq==x){
                    return mid;
                }
                if(sq<x){
                    ans=mid;
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        
        return ans;
    }
}