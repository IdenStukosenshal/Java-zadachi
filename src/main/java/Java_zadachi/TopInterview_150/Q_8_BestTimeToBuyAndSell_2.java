package Java_zadachi.TopInterview_150;


//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150

public class Q_8_BestTimeToBuyAndSell_2 {
    public static void main(String[] args) {
        Q_8_BestTimeToBuyAndSell_2 n8 = new Q_8_BestTimeToBuyAndSell_2();

        int[] prices = {5, 2, 3, 2, 6, 6, 2, 9, 1, 0, 7, 4, 5, 0};
        System.out.println(n8.maxProfit(prices));

    }

    public int maxProfit(int[] prices) {
        int buy = prices[0], sell;
        int rezult = 0;

        for (int right = 1, left = 0; right < prices.length; right++, left++) {

            if (prices[left] >= prices[right]) {
                if (right == prices.length - 1) {
                    return rezult;
                } else if (prices[right] < prices[right + 1]) {
                    buy = prices[right];
                }

            } else if (
                    (prices[left] < prices[right]) &&
                    (right + 1 == prices.length || prices[right] >= prices[right + 1])
            ) {
                sell = prices[right];
                rezult += sell - buy;
            }
        }
        return rezult;
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }

}
