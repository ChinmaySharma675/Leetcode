// Last updated: 9/5/2026, 7:27:12 PM
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