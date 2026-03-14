// Last updated: 3/14/2026, 8:10:32 PM
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int c=1;
5            if(nums[i]%2==0){
6                for(int j=0;j<nums.length;j++ ){
7                    if(i!=j && nums[i]==nums[j]){
8                        c++;
9                    }
10                }
11                if(c==1) return nums[i];
12            }
13            
14        }
15        return -1;
16        
17    }
18}