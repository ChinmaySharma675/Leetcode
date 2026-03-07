// Last updated: 3/7/2026, 10:35:13 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange){
            sum+=numBottles/numExchange;
            numBottles=numBottles%numExchange+ numBottles/numExchange;
        }
        return sum;
    }
}
