// Last updated: 3/7/2026, 10:35:45 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int  m=image.length;
       int[][] arr=new int[m][m];
       for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            arr[i][m-j-1]=image[i][j] ^ 1;
        }
       }
        return arr;
    }
}