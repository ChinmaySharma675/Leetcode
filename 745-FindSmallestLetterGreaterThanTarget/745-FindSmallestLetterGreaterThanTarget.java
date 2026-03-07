// Last updated: 3/7/2026, 10:35:50 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        int c=0;
        int d=0;
        int n=letters.length;
        while(d<=n-1 &&c==0){
        if(i<=n-1 && letters[i]>target ){
            c++;
            d++;
            return letters[i];
            
        } else{d++; }
        i++;
        }
        return letters[0];
    }
}