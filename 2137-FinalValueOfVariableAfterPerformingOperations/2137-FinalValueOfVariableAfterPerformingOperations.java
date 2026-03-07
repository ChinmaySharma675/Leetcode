// Last updated: 3/7/2026, 10:34:45 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")|| operations[i].equals("X--")){
                X-=1;
            } else{
                X+=1;
            }
        }
        
        return X;
    }
}