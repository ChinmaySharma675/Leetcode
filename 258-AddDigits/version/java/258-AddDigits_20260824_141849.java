// Last updated: 8/24/2026, 2:18:49 PM
1class Solution {
2    public int addDigits(int num) {
3
4        while(num>9){
5            num=Sumofdig(num);}
6        return num;
7    }
8    public static int Sumofdig(int n){
9        int num=0;
10        while(n!=0){
11            num+=n%10;
12            n/=10;
13        }
14        return num;
15    }
16}