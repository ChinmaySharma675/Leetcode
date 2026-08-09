// Last updated: 8/9/2026, 6:50:27 PM
class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int min=nums1[0];
        if(min%2==1) return true;

        for(int x:nums1){
            if(x%2!=0) return false;
        }
        return true;
    }
}