// Last updated: 8/9/2026, 6:51:26 PM
class Solution {
    public int minimumDistance(int[] nums) {
        Set<Integer> S=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && i!=k && nums[i]==nums[j] && nums[j]==nums[k]){
                        int a=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        S.add(a);
                    }
                }
            }
        }
        if(S.size()==0){
            return -1;
        }
        return Collections.min(S);
    }
}