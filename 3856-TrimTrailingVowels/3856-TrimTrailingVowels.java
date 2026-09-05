// Last updated: 9/5/2026, 7:27:22 PM
class Solution {
    public String trimTrailingVowels(String s) {
        boolean b=true;
        StringBuilder sb=new StringBuilder(s);
        
            for(int i=sb.length()-1;i>=0;i--){
                
                if(sb.charAt(i)=='a' || sb.charAt(i)=='e'|| sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'){
                    sb.deleteCharAt(i);
                } else{
                    return sb.toString();
                    
                }
            }
            
        
        
        return sb.toString();
    }
}