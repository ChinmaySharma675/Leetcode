// Last updated: 3/7/2026, 10:35:07 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int m=accounts.length; //this gives the number of rows of 2d array..
        int[] sumT=new int[m];
        int n = accounts[0].length; //this gives the number of columns of 2d array.
        for(int i=0;i<m;i++){
            int sum=0;
            for( int j=0;j<n;j++){
                sum+=accounts[i][j];

            }
            sumT[i]=sum;
        }
        int max=sumT[0];
        for(int i=0;i<m;i++){
            if(sumT[i]>max){
                max=sumT[i];
            }
        }
        return max;

    }
}