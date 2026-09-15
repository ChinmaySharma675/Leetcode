// Last updated: 9/15/2026, 6:21:58 PM
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        int n=candies.length;
4        List<Boolean> B=new ArrayList<>();
5        int max=candies[0];
6        for(int i=0;i<n;i++){
7            if(candies[i]>max){
8                max=candies[i];
9            }
10        }
11        for(int i=0;i<n;i++){
12            if(candies[i]+extraCandies >=max){
13                B.add(true);
14            }
15            else{
16                B.add(false);
17
18        }
19        
20    }
21    return B;
22}
23
24}