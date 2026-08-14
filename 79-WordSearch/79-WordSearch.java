// Last updated: 8/14/2026, 3:38:02 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(search(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

boolean search(char[][] board,String word, int i, int j, int k){
    if(k==word.length()){
        return true;
    }

    if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(k)){
        return false; //cell is invalid. check /move ahead to another cell
    }
    char temp=board[i][j];//saves current
    board[i][j]='#';//marks current is already used

    boolean ans=
                search(board,word,i+1,j,k+1)|| 
                search(board,word,i-1,j,k+1)||
                search(board,word,i,j+1,k+1)||
                search(board,word,i,j-1,k+1);
    board[i][j]=temp;

    return ans;            
}
}