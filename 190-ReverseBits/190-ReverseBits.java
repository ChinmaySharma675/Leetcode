// Last updated: 8/9/2026, 6:57:02 PM
class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            result = (result<<1) | (n&1);
            n=n>>1;
        }
        return result;
    }
}