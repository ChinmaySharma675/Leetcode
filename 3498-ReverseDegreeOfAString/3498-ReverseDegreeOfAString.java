// Last updated: 9/5/2026, 7:28:44 PM
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