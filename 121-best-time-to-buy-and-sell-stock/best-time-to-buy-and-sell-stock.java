class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; // Lowest price seen so far
        int maxProfit = 0;       // Best profit so far
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Found a cheaper day to buy!
            } else {
                int profit = prices[i] - minPrice; // Profit if we sell today
                if (profit > maxProfit) {
                    maxProfit = profit; // Update max profit if it's higher
                }
            }
        }
        
        return maxProfit;
    }
}