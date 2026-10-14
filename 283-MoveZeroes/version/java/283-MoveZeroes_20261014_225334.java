// Last updated: 10/14/2026, 10:53:34 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3
4        int pos=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]!=0){
7                int temp=nums[pos];
8                nums[pos]=nums[i];
9                nums[i]=temp;
10                pos++;
11            }
12        }
13        }
14    
15}