// Last updated: 8/24/2026, 10:29:25 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int z=0,o=0,t=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==0)z++;
6            else if(nums[i]==1)o++;
7            else t++;
8        }
9        for(int i=0;i<z;i++){
10            nums[i]=0;
11        }
12        for(int i=z;i<z+o;i++){
13            nums[i]=1;
14        }
15        for(int i=z+o;i<z+o+t;i++){
16            nums[i]=2;
17        }
18    }
19}