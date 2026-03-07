// Last updated: 3/7/2026, 10:34:50 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i=nums.length;i<2*nums.length;i++){
            ans[i]=nums[i-nums.length];
        }
        return ans;
    }
}

/*int n = nums.length;
int[] ans = new int[2*n];
int Nindex = 0;

    for(int i = 0;  i < 2*n; i++){
        if(Nindex == n){
           Nindex = 0;
        }
        ans[i] = nums[Nindex];
        Nindex ++;
    }
    return ans;
    */