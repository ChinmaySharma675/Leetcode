// Last updated: 3/7/2026, 10:35:08 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String S1= String.join("",word1);
        String S2= String.join("",word2);


        return S1.equals(S2);
    }

}