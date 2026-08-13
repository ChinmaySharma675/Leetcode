// Last updated: 8/13/2026, 9:50:21 AM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for(int i=0;i<board.length;i++){
4            for(int j=0;j<board[0].length;j++){
5
6                if(search(board,word,i,j,0)){
7                    return true;
8                }
9            }
10        }
11        return false;
12    }
13
14boolean search(char[][] board,String word, int i, int j, int k){
15    if(k==word.length()){
16        return true;
17    }
18
19    if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(k)){
20        return false; //cell is invalid. check /move ahead to another cell
21    }
22    char temp=board[i][j];//saves current
23    board[i][j]='#';//marks current is already used
24
25    boolean ans=
26                search(board,word,i+1,j,k+1)|| 
27                search(board,word,i-1,j,k+1)||
28                search(board,word,i,j+1,k+1)||
29                search(board,word,i,j-1,k+1);
30    board[i][j]=temp;
31
32    return ans;            
33}
34}