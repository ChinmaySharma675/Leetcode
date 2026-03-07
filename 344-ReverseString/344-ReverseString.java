// Last updated: 3/7/2026, 10:36:08 PM
class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char al=s[right];
            s[right]=s[left];
            s[left]=al;
            left++;
            right--;
        }
        
    }
}