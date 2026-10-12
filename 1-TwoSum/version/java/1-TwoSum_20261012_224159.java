// Last updated: 10/12/2026, 10:41:59 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer,Integer> map=new HashMap<>();
4
5        for(int i=0;i<nums.length;i++){
6
7            int comp=target-nums[i];
8            
9
10            if(map.containsKey(comp)){
11                return new int[] {map.get(comp),i};
12            }
13            map.put(nums[i],i);
14            
15        }
16        return new int[] {};
17    }
18}