// Last updated: 3/21/2026, 7:01:50 PM
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int start=1;
4        int c=0;
5        for(int i=0;i<arr.length;i++){
6            if(arr[i]!=start){
7                for(int j=start;j<arr[i];j++){
8                 c++;
9                if(c==k)return j;
10             
11                }
12            }
13            start=arr[i]+1;
14        }
15        return start+k-c-1;
16    }
17}