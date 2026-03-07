// Last updated: 3/7/2026, 10:33:37 PM
class Solution {
    public String trimTrailingVowels(String s) {
        int c=s.length()-1;
        for(int j=s.length()-1;j>=0;j--){
            if(s.charAt(j)=='a' ||s.charAt(j)=='e'||s.charAt(j)=='i'|| s.charAt(j)=='o' ||s.charAt(j)=='u') c--;
         else {
            break;
        }
        }
        s=s.substring(0,c+1);
        return s;
    }
}