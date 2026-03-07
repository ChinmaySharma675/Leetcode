// Last updated: 3/7/2026, 10:35:36 PM
class Solution {
    public int heightChecker(int[] heights) {
        
        int[] exp=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            exp[i]=heights[i];
        }
        Arrays.sort(heights);
        int c=0;
        for(int i=0;i<exp.length;i++){
            if(heights[i]!=exp[i]) c++;
        }
        return c;
    }
}