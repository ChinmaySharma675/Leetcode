// Last updated: 3/7/2026, 10:36:20 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
       if(n<2)return 0;
       int min=prices[0];
       int maxProfit=0;
     
       for(int i=1;i<n;i++){
        if(prices[i]<min){
            min=prices[i];
        } else{
            int profit=prices[i]-min;
            maxProfit=Math.max(profit,maxProfit);
        }
       }
       return maxProfit;
        
    }
}