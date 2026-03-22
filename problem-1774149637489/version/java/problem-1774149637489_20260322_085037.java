// Last updated: 3/22/2026, 8:50:37 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        Arrays.sort(nums1);
4        int min=nums1[0];
5        if(min%2==1) return true;
6
7        for(int x:nums1){
8            if(x%2!=0) return false;
9        }
10        return true;
11    }
12}