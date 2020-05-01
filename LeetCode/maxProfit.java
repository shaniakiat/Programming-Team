import java.util.Arrays;

public class maxProfit {
    public static void main(String[] args) {

        // 7 --> 1
        // 1 --> 2
        // 5 --> 3
        // 3 --> 4
        // 6 --> 5
        // 4 --> 6

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int[] newPrices = prices.clone();

        Arrays.sort(newPrices);

        System.out.println(prices[0] + ", " + prices[prices.length - 1]);
        System.out.println(newPrices[0] + ", " + newPrices[newPrices.length - 1]);

        // sort it
        // we only consider rprice = 1 at 2 --> 5
        // check if we consider price 3 on the fourth day --> 7

        // we need to sell 1 before we reach number 3, find the highest price between
        // this range.
        // 4+3 // 7

        //

    }
}