package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150

public class Q_7_BestTimeToBuyAndSell_1 {
    public static void main(String[] args) {
        Q_7_BestTimeToBuyAndSell_1 mp = new Q_7_BestTimeToBuyAndSell_1();

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(mp.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int rezult = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                rezult = Math.max(rezult, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }
        return rezult;
    }
}
