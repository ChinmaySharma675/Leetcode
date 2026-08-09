// Last updated: 8/9/2026, 6:55:25 PM
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count[] = new int[1001];

        for(int num:arr1){ ///this countss elemetns in arr1
            count[num]++;
        }

        int index=0;
        for(int num:arr2){ //first we put nums according to arr2 order
            while(count[num]>0){
                arr1[index]=num;
                index++;
                count[num]--;
            }
        }
        for(int num=0;num<1001;num++){ //remaining elemetns of arr1 are put in ascending order now
            while(count[num]>0){
                arr1[index]=num;
                index++;
                count[num]--;
            }
        }
        return arr1;
    }

}