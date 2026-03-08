// Last updated: 3/8/2026, 8:48:42 PM
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            k='z'-s.charAt(i)+1;
            
            int prod=k*(i+1);
            sum+=prod;
        }
        return sum;
    }
}