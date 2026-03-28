// Last updated: 3/28/2026, 8:15:30 PM
1class Solution {
2    public int minAbsoluteDifference(int[] nums) {
3        int min=Integer.MAX_VALUE;
4       
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                for(int j=0;j<nums.length;j++){
8                    if(nums[j]==2){
9                    min=Math.min(min,Math.abs(i-j));
10                        
11                    }
12                }
13            }
14                    
15         }
16        if(min==Integer.MAX_VALUE) return -1;
17        return min;
18    }
19}