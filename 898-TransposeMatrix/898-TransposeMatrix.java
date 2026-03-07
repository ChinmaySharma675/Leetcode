// Last updated: 3/7/2026, 10:35:43 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] p=new int[n][m];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            
            p[j][i]=matrix[i][j];
        }
    }
    return p;
    }
}