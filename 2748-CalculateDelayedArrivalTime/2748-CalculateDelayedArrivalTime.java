// Last updated: 3/7/2026, 10:34:28 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int c=arrivalTime+delayedTime;
        if(c>=24) return c-24 ;
        return c;
        
    }
}