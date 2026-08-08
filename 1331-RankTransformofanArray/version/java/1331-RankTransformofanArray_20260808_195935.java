// Last updated: 8/8/2026, 7:59:35 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int[] sorted=arr.clone();
4        Arrays.sort(sorted);
5
6        HashMap<Integer,Integer> map=new HashMap<>();
7
8        int rank=1;
9        for(int num:sorted){
10            if(!map.containsKey(num)){
11                map.put(num,rank);
12                rank++;
13            }
14        }
15        for(int i=0;i<arr.length;i++){
16            arr[i]=map.get(arr[i]);
17        }
18        return arr;
19    }
20}