// Last updated: 8/9/2026, 6:54:18 PM
class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while( i<command.length()){
            if(command.substring(i,i+1).equals("G")){
                sb.append("G");
                i++;
            } else if(i+1<=command.length() && command.substring(i,i+2).equals("()") ){
                sb.append("o");
                i+=2;
            } else if( i+3<=command.length() && command.substring(i,i+4).equals("(al)")){
                sb.append("al");
                i+=4;
            }
        }
        return sb.toString();
    }
}