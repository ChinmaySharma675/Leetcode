// Last updated: 3/7/2026, 10:35:46 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        
        if((s+s).contains(goal) && s.length()==goal.length()){
            
            return true;
        } 
        return false;
    }
}