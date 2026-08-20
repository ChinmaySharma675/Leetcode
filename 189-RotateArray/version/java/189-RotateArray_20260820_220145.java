// Last updated: 8/20/2026, 10:01:45 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3    
4    k%=nums.length;
5    if(k<0)
6    {
7        k+=nums.length;
8    }
9    reverse(nums,0,nums.length-1);
10    reverse(nums,0,k-1);
11    reverse(nums,k,nums.length-1);
12    }
13    
14    private void reverse(int nums[] , int left , int right)
15    {
16        while(left < right)
17        {
18            int temp = nums[left];
19            nums[left] = nums[right];
20            nums[right] = temp;
21            left++;
22            right--;
23        }
24    }
25    
26}