// Last updated: 3/7/2026, 10:34:54 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
       Set<Character> S=new HashSet<>();

       for(char c:sentence.toCharArray()){
        S.add(c);
       }
       return S.size()==26;
    }
}