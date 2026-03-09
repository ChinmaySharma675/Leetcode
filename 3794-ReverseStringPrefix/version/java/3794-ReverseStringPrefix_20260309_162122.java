// Last updated: 3/9/2026, 4:21:22 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        int j=k-1;
4        char[] array=s.toCharArray();
5        for(int i=0;i<k/2;i++){
6            char temp=array[i];
7            array[i]=array[j];
8            array[j]=temp;
9            j--;
10        }
11        return new String(array);
12    }
13}