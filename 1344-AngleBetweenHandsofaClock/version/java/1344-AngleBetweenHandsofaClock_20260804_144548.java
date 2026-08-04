// Last updated: 8/4/2026, 2:45:48 PM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        hour%=12;  //gives the correct hour as after 12 hours clock repeats..
4        double angle=Math.abs(30*hour-(11.0 *minutes)/2); //11.0 instead of 11 as otherwise 11/2 give 5 instead of 5.5
5        angle=Math.min(angle,360-angle); //takes the smaller angle
6        return angle;
7
8    }
9}