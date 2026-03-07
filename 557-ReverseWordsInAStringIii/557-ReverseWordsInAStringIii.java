// Last updated: 3/7/2026, 10:36:01 PM
class Solution {
    public String reverseWords(String s) {
        String[] SPLIT = s.split(" ");
        for(int i=0;i<SPLIT.length;i++){
        StringBuilder sb=new StringBuilder(SPLIT[i]);
        sb.reverse();
        SPLIT[i]=sb.toString();
        }
        
    return String.join(" ",SPLIT);
    }
}