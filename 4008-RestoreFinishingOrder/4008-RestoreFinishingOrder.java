// Last updated: 3/7/2026, 10:33:49 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr=new int[friends.length];
        int j=0;
        for(int num:order){
        for(int i=0;i<friends.length;i++){
            if(friends[i]==num) { arr[j++]=num;}
        }
        }
        return arr;
        
    }
}