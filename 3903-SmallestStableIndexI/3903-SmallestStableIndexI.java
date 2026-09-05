// Last updated: 9/5/2026, 7:26:42 PM
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] score = new int[nums.length];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i]; 
            
            int min = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) min = nums[j];
            }
            
            score[i] = max - min; 
        }
        
        for (int i = 0; i < score.length; i++) {
            if (score[i] <= k) {
                return i; 
            }
        }
        
        return -1; 
    }
}
