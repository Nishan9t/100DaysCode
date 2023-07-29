// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
  public int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int maxProfit = 0;
    int maxP = 0;
    if (prices.length < 2) {
      return 0;
    }
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
      maxProfit = prices[i] - minPrice;
      maxP = Math.max(maxP, maxProfit);
    }
    return maxP;
  }
}
