// Last updated: 3/7/2026, 10:36:00 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> S=new HashSet<>();
        for(int num:candyType){
            S.add(num);
        }
        int k=S.size();
        int d=candyType.length/2;
        if(k>d){
            return d;
        }
        return k;
        
    }
}