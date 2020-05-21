import java.util.Arrays;

public class maxProfit {
    public static void main(String[] args) {

        // 7 --> 1
        // 1 --> 2
        // 5 --> 3
        // 3 --> 4
        // 6 --> 5
        // 4 --> 6

        int[] prices = { 7, 6, 4, 3, 1 };
        int result = 0;
        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int priceBuy = prices[i];
            int priceSell = 0;
            int indexBuy = 0;
            int indexSell = 0;
            System.out.println("day: " + (i + 1) + ", priceBuy: " + priceBuy);

            for (int j = prices.length - 1; j > i; j--) {
                if (prices[j] > prices[i]) {
                    priceSell = prices[j];
                    indexBuy = i;
                    indexSell = j;
                    System.out.println("day: " + (j + 1) + ", priceSell: " + priceSell);

                }

                if (priceSell != 0) {
                    // result += (priceSell - priceBuy);
                    // if theres a transation
                    int currResult = priceSell - priceBuy;
                    System.out.println("currResult: " + currResult);

                    if (currResult > result) {
                        result = currResult;
                        System.out.println("result: " + result);
                        System.out.println();
                    }
                    // if the transaction is a success
                }

            }
        }

        System.out.println(result);

    }
}