// Last updated: 8/3/2026, 11:29:20 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int low=0;
4        int mid=0;
5        int high=nums.length-1;
6        while(mid<=high){
7            if(nums[mid]==0){ //we swap nus[low] and nums[mid] and move both pointers forward.
8                int temp=nums[mid];
9                nums[mid]=nums[low];
10                nums[low]=temp;
11
12                low++;
13                mid++;
14            } else if(nums[mid]==1){//we just move mid pointer forward.
15                mid++;
16            }else{ //nums[mid]==2, we swwap mid and high and move mid pointer forward and high pointer backward
17
18                int temp=nums[high];
19                nums[high]=nums[mid];
20                nums[mid]=temp;
21                high--;
22        
23            }
24        }
25    }
26}