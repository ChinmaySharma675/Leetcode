// Last updated: 9/18/2026, 7:30:30 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n=nums.length;
4        int count=0;
5        int sum=0;
6
7        HashMap<Integer,Integer> map=new HashMap<>();
8        map.put(0,1);
9        for(int i=0;i<n;i++){
10            sum+=nums[i];
11
12            int rem=sum-k;
13
14            if(map.containsKey(rem)){
15                count+=map.get(rem);
16            }
17
18            map.put(sum,map.getOrDefault(sum,0)+1);
19        }
20        return count;
21
22    }
23}