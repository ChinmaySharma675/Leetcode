// Last updated: 3/7/2026, 10:35:27 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        hour%=12;  //gives the correct hour as after 12 hours clock repeats..
        double angle=Math.abs(30*hour-(11.0 *minutes)/2); //11.0 instead of 11 as otherwise 11/2 give 5 instead of 5.5
        angle=Math.min(angle,360-angle); //takes the smaller angle
        return angle;

    }
}