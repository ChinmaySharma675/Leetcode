// Last updated: 3/7/2026, 10:35:41 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr=new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j+=2; //j runs on even index only
            } else{
                arr[k]=nums[i];
                k+=2;
            }
            
        }
        return arr;
        
    }
}