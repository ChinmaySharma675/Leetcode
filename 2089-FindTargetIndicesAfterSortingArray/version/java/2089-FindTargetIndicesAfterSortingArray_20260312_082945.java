// Last updated: 3/12/2026, 8:29:45 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        List<Integer> L=new ArrayList<>();
4        Arrays.sort(nums);
5        
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]==target){
8                L.add(i);
9            }
10            if(nums[i]>target) {
11                return L;
12            }
13        }
14        return L;
15    }
16}