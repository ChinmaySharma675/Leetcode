// Last updated: 3/7/2026, 10:34:53 PM
class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] finals=new String[words.length];

        for(String word:words){
            int position=word.charAt(word.length()-1)-'0'; //subtracted by zero to Convert the   character    digit  to its integer value..as word.charAt gives the ASCII value of the last digit present at the end of word.
            String fullword=word.substring(0,word.length()-1);
            finals[position-1]=fullword;
        } 
        return String.join(" ",finals);
    }
}