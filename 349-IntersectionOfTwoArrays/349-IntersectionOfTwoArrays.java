// Last updated: 3/7/2026, 10:36:06 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set=new HashSet<>();
       for(int x:nums1){
        for(int i=0;i<nums2.length;i++){
            if(x==nums2[i]){
                set.add(x);
            }
        }
       }
       int[] result=new int[set.size()];
       int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}