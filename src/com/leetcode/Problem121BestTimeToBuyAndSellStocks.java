package com.leetcode;

public class Problem121BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        Problem121BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new Problem121BestTimeToBuyAndSellStocks();
        int[] ar = {7, 1, 5, 3, 6, 4};
        int profit = bestTimeToBuyAndSellStocks.maxProfit(ar);
        System.out.println(profit);
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
            int profit = prices[i] - lowestPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
