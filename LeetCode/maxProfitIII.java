public class maxProfitIII {
    public static void main(String[] args) {

        int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };

        int[] result = new int[2];

        int max = Integer.MIN_VALUE;
        int j = prices.length - 1;
        index = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int curr = prices[i] - prices[j];
            if (curr > max) {
                max = curr;
            }
        }

    }

}