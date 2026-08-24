// Last updated: 8/24/2026, 10:45:07 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int i=0;
4        int j=height.length-1;
5        int max=0;
6
7        while(i<j){
8            int area=(Math.min(height[i],height[j])) * (j-i);
9            max=Math.max(max,area);
10
11            if(height[i]<height[j]){
12                i++;
13            }else j--;
14        }
15        return max;
16    }
17}