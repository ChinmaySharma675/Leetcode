// Last updated: 4/13/2026, 12:31:27 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3      int result=0;
4      for(int i=0;i<32;i++){
5        int sum=0;
6        for(int num:nums){
7            if(((num>>i) & 1)==1) {
8                sum++;
9            }
10        }
11        if(sum%3 !=0){
12            result |= (1<<i);
13        }
14      }
15      return result;
16        
17    }
18}