class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length<=1){
          return 0;
        }
        int Profit=0;
        for(int i=1;i<prices.length;i++){
          if(prices[i-1] < prices[i]){
            Profit += prices[i]-prices[i-1];
          }
        }
      return Profit;
    }
}
