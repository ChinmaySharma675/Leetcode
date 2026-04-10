// Last updated: 4/10/2026, 9:03:00 AM
1class Solution {
2    public int minimumDistance(int[] nums) {
3        Set<Integer> S=new HashSet<>();
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                for(int k=0;k<n;k++){
8                    if(i!=j && j!=k && i!=k && nums[i]==nums[j] && nums[j]==nums[k]){
9                        int a=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
10                        S.add(a);
11                    }
12                }
13            }
14        }
15        if(S.size()==0){
16            return -1;
17        }
18        return Collections.min(S);
19    }
20}