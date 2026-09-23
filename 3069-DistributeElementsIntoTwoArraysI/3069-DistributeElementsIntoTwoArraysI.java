// Last updated: 9/23/2026, 1:29:17 PM
class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> L1=new ArrayList<>();
        List<Integer> L2=new ArrayList<>();

        L1.add(nums[0]);
        L2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if(L1.get(L1.size()-1)>L2.get(L2.size()-1)){
                L1.add(nums[i]);
            }else{
                L2.add(nums[i]);
            }
        }
        L1.addAll(L2);
        int[] arr=new int[L1.size()];
        for(int i=0;i<L1.size();i++){
            arr[i]=L1.get(i);
        }
        return arr;
    }
}