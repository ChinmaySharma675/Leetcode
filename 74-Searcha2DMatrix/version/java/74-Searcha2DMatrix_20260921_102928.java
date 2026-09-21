// Last updated: 9/21/2026, 10:29:28 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3       
4      int m=matrix.length;
5      int n=matrix[0].length;
6
7      int l=0,h=n*m-1;
8
9      while(l<=h){
10        int mid=l+(h-l)/2;
11        
12        int r=mid/n;
13        int c=mid%n;
14
15        if(matrix[r][c]==target) return true;
16        else if(matrix[r][c]<target)l=mid+1;
17        else h=mid-1;
18      }
19        return false;
20    }
21}  