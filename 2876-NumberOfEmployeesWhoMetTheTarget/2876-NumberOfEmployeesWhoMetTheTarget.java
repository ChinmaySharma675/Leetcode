// Last updated: 3/7/2026, 10:34:25 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target) c++;
        }
        return c;
    }
}