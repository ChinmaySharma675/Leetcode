// Last updated: 3/7/2026, 10:35:21 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> B=new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies >=max){
                B.add(true);
            }
            else{
                B.add(false);

        }
        
    }
    return B;
}

}