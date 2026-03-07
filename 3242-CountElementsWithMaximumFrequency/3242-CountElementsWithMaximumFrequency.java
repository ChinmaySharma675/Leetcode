// Last updated: 3/7/2026, 10:34:19 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            arr[i]=c;
        }
        int m=arr[0];
        for(int i=0;i<nums.length;i++){
            if(arr[i]>=m)
            {
                m=arr[i];
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(arr[i]==m){
                count+=1;
            }
        }
        return count*m;
        
    }
}