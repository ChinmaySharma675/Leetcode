// Last updated: 3/7/2026, 10:36:05 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int l=0;
        int r=num/2;
        if(num==1){
            return true;
        }
        while(l<=r){
            int mid=l+ (r-l)/2;
            long sqr=(long)mid*mid;
            if(mid*mid==num){
                return true;
            }
            if(sqr<num){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
    }
}