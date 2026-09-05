// Last updated: 9/5/2026, 7:27:53 PM
class Solution {
    public int minimumFlips(int n) {
       String s=Integer.toBinaryString(n);
       int i=0;
       int j=s.length()-1;
       int flips=0;
       while(i<j){
        if(s.charAt(i)!=s.charAt(j)) {
            flips+=2;

        }
        i++;
        j--;
       }
    return flips;
    }
}