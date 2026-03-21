// Last updated: 3/21/2026, 7:39:02 PM
1class Solution {
2    public int hIndex(int[] citations) {
3        int n=citations.length;
4        int l=0;
5        int r=n-1;
6        while(l<=r){
7            int mid=l+(r-l)/2;
8
9            if(citations[mid]>=(n-mid)){
10                r=mid-1;
11            }else{
12                l=mid+1;
13            }
14        }
15        return n-l;
16    }
17}