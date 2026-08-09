// Last updated: 8/9/2026, 6:50:55 PM
class Solution {
    public int countCommas(int n) {
        int commas=0;
        for(int i=1;i<=n;i++){
            int digits=String.valueOf(i).length();
            commas+=(digits-1)/3;
        }
        return commas;
    }
}