// Last updated: 3/7/2026, 10:35:10 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int m=mat.length;

        for(int i=0;i<m;i++){
                    sum+=mat[i][i];
        }
        int i=m-1;
        int j=0;
        while(i>=0||j<m){
            
                if(i!=j){
                sum+=mat[i][j];
                }
            i--;
            j++;
        }
        return sum;
    
}
}