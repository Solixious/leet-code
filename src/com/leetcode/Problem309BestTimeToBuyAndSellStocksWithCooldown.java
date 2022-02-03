package com.leetcode;

public class Problem309BestTimeToBuyAndSellStocksWithCooldown {

    public static void main(String[] args) {
        Problem309BestTimeToBuyAndSellStocksWithCooldown bestTimeToBuyAndSellStocksWithCooldown =
                new Problem309BestTimeToBuyAndSellStocksWithCooldown();
        int[] ar = {6, 1, 3, 2, 4, 7};
        System.out.println(bestTimeToBuyAndSellStocksWithCooldown.maxProfit(ar));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        buy[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            int current = prices[i];
            buy[i] = Math.max(buy[i - 1], (i > 1 ? sell[i - 2] : 0) - current);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + current);
        }
        return sell[sell.length - 1];
    }
}
