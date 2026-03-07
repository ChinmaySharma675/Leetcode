// Last updated: 3/7/2026, 10:35:25 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int count=0;
    for(int[] row:grid){ //iterates over each row in 2d array
        for(int num:row){  //iterates over each num in a row.
            if(num<0){   //we couldnt have used for(int num:grid) as grid is 2d array..so doest search likethis
            count++;
            }}
       }
        return count;
    }
}
