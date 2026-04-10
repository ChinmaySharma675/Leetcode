// Last updated: 4/10/2026, 9:26:29 AM
1class Solution {
2    public int[] countBits(int n) {
3        int[] arr= new int[n+1];
4        int j=0;
5        int k=0;
6        while(k<n+1){
7        int b=Integer.bitCount(k);
8        arr[j]=b;
9        j++;
10        k++;
11        }
12
13        return arr;
14    }
15}