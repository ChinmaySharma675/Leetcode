// Last updated: 8/18/2026, 7:27:10 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        ArrayList<Integer> list=new ArrayList<>();
4        for(int num:digits){
5            list.add(num);
6        }
7
8        boolean carry=true;
9        for(int i=list.size()-1;i>=0;i--){
10            if(list.get(i)<9){
11            list.set(i,list.get(i)+1);
12            carry=false;
13            break;
14        }else{
15            list.set(i,0);
16        }
17        }
18
19        if(carry){
20            list.set(0,1);
21            list.add(0);
22        }
23
24        
25        int[] arr=new int[list.size()];
26        for(int i=0;i<list.size();i++){
27            arr[i]=list.get(i);
28        }
29
30        return arr;
31    }
32}