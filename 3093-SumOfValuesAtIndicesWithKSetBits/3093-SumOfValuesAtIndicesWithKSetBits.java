// Last updated: 3/7/2026, 10:34:24 PM
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int c=Integer.bitCount(i);
            if(c==k) sum+=nums.get(i);
        }
        return sum;
        
    }
}