// Last updated: 3/7/2026, 10:33:47 PM
class Solution {
    public int earliestTime(int[][] tasks) {
        int sum=tasks[0][0]+tasks[0][1];
        for(int i=0;i<tasks.length;i++){
            if(sum>tasks[i][0]+tasks[i][1]){
                sum=tasks[i][0]+tasks[i][1];
            } 
        }
        return sum;
    }
}