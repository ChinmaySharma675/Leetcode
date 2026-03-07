// Last updated: 3/7/2026, 10:35:05 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        String H1=s.substring(0,s.length()/2);
         String H2=s.substring(s.length()/2,s.length());
         int c1=0,c2=0;
         String vowels="aeiouAEIOU";
         for(int i=0;i<H1.length();i++){
         if(vowels.indexOf(H1.charAt(i))!=-1){  // not equal to -1 used if a character is not in string the index it returns is -1...so if there is a vowel than it will not return -1..that is !=-1                                        
            c1++;  
         }
         }
         for(int i=0;i<H2.length();i++){
         if(vowels.indexOf(H2.charAt(i))!=-1){
            c2++;
         }
         }
        return (c1==c2);
    }
}