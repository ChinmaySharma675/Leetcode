// Last updated: 3/7/2026, 10:34:17 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxarea=0;
        int maxdiagonal=0;
        for(int i=0;i<dimensions.length;i++){
           int diagonal = dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
            int area = dimensions[i][0] * dimensions[i][1];

            if(diagonal>maxdiagonal || (maxdiagonal==diagonal  && area>maxarea)){
                maxdiagonal=diagonal;
                maxarea=area;
            }

        }
       
        return maxarea;
    }
}