// Last updated: 8/9/2026, 6:57:28 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        boolean[] rows=new boolean[m];
        boolean[] cols=new boolean[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){  //making rows 0
            if(rows[i]){
                for(int j=0;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }

           for(int j=0;j<n;j++){ //making cols 0
            if(cols[j]){
                for(int i=0;i<m;i++){
                    matrix[i][j]=0;
                }
            }
        }

    }
}