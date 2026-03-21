// Last updated: 3/21/2026, 7:15:48 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3       
4        for(int i=0;i<matrix.length;i++){
5            int l=0;
6            int r=matrix[0].length-1;
7        while(l<=r){
8            int mid=l+(r-l)/2;
9            if(matrix[i][mid]==target) return true;
10            if(matrix[i][mid]>target)r=mid-1;
11            else l=mid+1;
12        }
13        }
14        return false;
15    }
16}  