// Last updated: 3/10/2026, 11:48:16 PM
1class Solution {
2    public String interpret(String command) {
3        StringBuilder sb=new StringBuilder();
4        int i=0;
5        while( i<command.length()){
6            if(command.substring(i,i+1).equals("G")){
7                sb.append("G");
8                i++;
9            } else if(i+1<=command.length() && command.substring(i,i+2).equals("()") ){
10                sb.append("o");
11                i+=2;
12            } else if( i+3<=command.length() && command.substring(i,i+4).equals("(al)")){
13                sb.append("al");
14                i+=4;
15            }
16        }
17        return sb.toString();
18    }
19}