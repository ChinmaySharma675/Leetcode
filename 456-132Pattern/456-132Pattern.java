// Last updated: 8/9/2026, 6:56:28 PM
class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums==null || nums.length<3) return false;
        Stack<Integer> stack=new Stack<>();
        int num2=Integer.MIN_VALUE; // for representing 2 in the 132

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<num2) { //if we found a number smaller than num2 that means we found our 1 in 132.
                return true;
            }
            //if the current ele is greater than top of stack then it can serve as a better 3 so we pop the stack to update our 2 in num2.
            while(!stack.isEmpty() && nums[i]>stack.peek()){
                num2=stack.pop();
            }
            stack.push(nums[i]); //pushed te current element as a potential 2 or 3 of 132 pattern
        }
        return false;
    }
}