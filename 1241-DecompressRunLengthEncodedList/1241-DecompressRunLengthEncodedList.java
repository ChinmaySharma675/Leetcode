// Last updated: 3/7/2026, 10:35:32 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> L=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int j=nums[i];
            while(j!=0){
                L.add(nums[i+1]);
                j--;
            }
        }
        int[] arr=new int[L.size()];
        for(int i=0;i<L.size();i++){
            arr[i]=L.get(i);
        }
        return arr;
        
    }
}