package com.leetcode;

public class Problem122BestTimeToBuyAndSellStockTwo {

    public static void main(String[] args) {
        Problem122BestTimeToBuyAndSellStockTwo bestTimeToBuyAndSellStockTwo = new Problem122BestTimeToBuyAndSellStockTwo();
        int[] ar = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeToBuyAndSellStockTwo.maxProfit(ar));
    }

    public int maxProfit(int[] prices) {
        int length = prices.length;
        int i = 0;
        int profit = 0;
        while (i < length) {
            // Find local minimum
            int localMin = i;
            while (i < length && prices[localMin] >= prices[i]) {
                localMin = i;
                i++;
            }

            //Find local maximum
            int localMax = i;
            while (i < length && prices[localMax] <= prices[i]) {
                localMax = i;
                i++;
            }
            if (localMax < length && localMax > localMin) {
                profit += (prices[localMax] - prices[localMin]);
            }
        }
        return profit;
    }
}
