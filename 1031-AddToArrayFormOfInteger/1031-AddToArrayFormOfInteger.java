// Last updated: 3/7/2026, 10:35:37 PM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i=num.length-1;
        ArrayList<Integer> arr=new ArrayList<>();
        while(k>0 || i>=0){
            if(i>=0){
            k=k+num[i];
            i--;
            }
            arr.add(k%10);
            k/=10;
        }
        Collections.reverse(arr);
        return arr;
    }
}