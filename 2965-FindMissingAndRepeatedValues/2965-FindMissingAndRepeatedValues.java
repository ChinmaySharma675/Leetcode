// Last updated: 9/23/2026, 1:29:32 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        int n=grid.length;
        Set<Integer> S=new HashSet<>();
        int end=n*n;    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!S.add(grid[i][j])){
                    ans[0]=grid[i][j];
                } 
            }
        }
        for(int i=1;i<=end;i++){
            if(!S.contains(i)){
                    ans[1]=i;
                    break;
                }
        }
        return ans;
    }
}