// Last updated: 8/25/2026, 12:03:17 AM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        Arrays.sort(people);
4        int l=0;
5        int r=people.length-1;
6        int boat=0;
7
8        while(l<=r){
9            if(people[l]+people[r]<=limit){
10                l++;
11            }
12
13            r--;
14            boat++;
15        }
16        return boat;
17    }
18}