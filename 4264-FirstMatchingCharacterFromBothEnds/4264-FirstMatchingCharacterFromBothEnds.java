// Last updated: 8/9/2026, 6:50:31 PM
class Solution {
    public int firstMatchingIndex(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)) return l;
            l++;
            r--;
        }
        return -1;
        
    }
}