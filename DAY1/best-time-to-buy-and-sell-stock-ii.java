// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
  public int maxProfit(int[] prices) {
    int oldPrices = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < oldPrices) {
        // update the oldPrices
        oldPrices = prices[i];
      } else {
        // find Profit
        profit += prices[i] - oldPrices;
        // update the oldPrices
        oldPrices = prices[i];
      }
    }
    return profit;

  }
}
