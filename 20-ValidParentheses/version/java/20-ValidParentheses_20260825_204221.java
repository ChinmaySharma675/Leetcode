// Last updated: 8/25/2026, 8:42:21 PM
1class Solution {
2    public boolean isValid(String s) {
3       Stack<Character> stack=new Stack<>();
4       for(char ch:s.toCharArray()){
5        if(ch=='(' || ch=='{' || ch=='['){
6            stack.push(ch);
7        }
8        else {
9            if(stack.isEmpty()) return false;
10        
11        char top=stack.pop();
12        if ((ch==')' && top != '(') || (ch=='}' && top!= '{') || (ch==']' && top!= '[')){
13            return false;
14        }
15       } 
16    }
17       return stack.isEmpty();
18    }
19}