// Last updated: 8/8/2026, 8:14:22 PM
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        int count[] = new int[1001];
4
5        for(int num:arr1){ ///this countss elemetns in arr1
6            count[num]++;
7        }
8
9        int index=0;
10        for(int num:arr2){ //first we put nums according to arr2 order
11            while(count[num]>0){
12                arr1[index]=num;
13                index++;
14                count[num]--;
15            }
16        }
17        for(int num=0;num<1001;num++){ //remaining elemetns of arr1 are put in ascending order now
18            while(count[num]>0){
19                arr1[index]=num;
20                index++;
21                count[num]--;
22            }
23        }
24        return arr1;
25    }
26
27}