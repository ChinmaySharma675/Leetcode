// Last updated: 9/23/2026, 1:30:03 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int c=arrivalTime+delayedTime;
        if(c>=24) return c-24 ;
        return c;
        
    }
}