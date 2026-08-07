// Last updated: 8/7/2026, 10:02:02 AM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        if(nums==null || nums.length<3) return false;
4        Stack<Integer> stack=new Stack<>();
5        int num2=Integer.MIN_VALUE; // for representing 2 in the 132
6
7        for(int i=nums.length-1;i>=0;i--){
8            if(nums[i]<num2) { //if we found a number smaller than num2 that means we found our 1 in 132.
9                return true;
10            }
11            //if the current ele is greater than top of stack then it can serve as a better 3 so we pop the stack to update our 2 in num2.
12            while(!stack.isEmpty() && nums[i]>stack.peek()){
13                num2=stack.pop();
14            }
15            stack.push(nums[i]); //pushed te current element as a potential 2 or 3 of 132 pattern
16        }
17        return false;
18    }
19}