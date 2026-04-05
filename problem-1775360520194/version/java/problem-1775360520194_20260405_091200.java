// Last updated: 4/5/2026, 9:12:00 AM
1class Solution {
2    public List<Integer> findGoodIntegers(int n) {
3       Map<Integer,Integer> map=new HashMap<>();
4        int limit=(int)Math.cbrt(n); //we search till cube root of n only, not further it..
5
6        for(int a=1;a<=limit;a++){
7            int a3=a*a*a;
8            for(int b=a;b<=limit;b++){
9                int sum=a3+b*b*b;
10
11                if(sum>n)break;
12
13                map.put(sum,map.getOrDefault(sum,0)+1);
14            }
15        }
16        List<Integer> result=new ArrayList<>();
17        for(int key:map.keySet()){
18            if(map.get(key)>=2){
19                result.add(key);
20            }
21        }
22        Collections.sort(result);
23        return result;
24    }
25}