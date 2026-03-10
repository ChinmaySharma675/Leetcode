// Last updated: 3/10/2026, 11:30:08 PM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        boolean b=true;
4        StringBuilder sb=new StringBuilder(s);
5        
6            for(int i=sb.length()-1;i>=0;i--){
7                
8                if(sb.charAt(i)=='a' || sb.charAt(i)=='e'|| sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'){
9                    sb.deleteCharAt(i);
10                } else{
11                    return sb.toString();
12                    
13                }
14            }
15            
16        
17        
18        return sb.toString();
19    }
20}