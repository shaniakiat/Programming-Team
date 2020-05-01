import java.util.ArrayList;
import java.util.Arrays;

public class profitTarget {
    public static void main(String[] args) {

        ArrayList<Integer> stocksProfit = new ArrayList<>();
        ArrayList<String> listOfDistinctStocks = new ArrayList<>();
        // stocksProfit.add(5);
        // stocksProfit.add(7);
        // stocksProfit.add(9);
        // stocksProfit.add(13);
        // stocksProfit.add(11);
        // stocksProfit.add(6);
        // stocksProfit.add(6);
        // stocksProfit.add(3);
        // stocksProfit.add(9);

        // stocksProfit.add(3);
        // long target = 12;

        // stocksProfit.add(7);
        // stocksProfit.add(6);
        // stocksProfit.add(12);
        // stocksProfit.add(3);
        // stocksProfit.add(9);
        // stocksProfit.add(3);
        // stocksProfit.add(5);
        // stocksProfit.add(1);
        // long target = 12;

        // stocksProfit.add(6);
        // stocksProfit.add(6);
        // stocksProfit.add(3);
        // stocksProfit.add(9);
        // stocksProfit.add(3);
        // stocksProfit.add(5);
        // long target = 12;

        stocksProfit.add(1);
        stocksProfit.add(3);
        stocksProfit.add(46);
        stocksProfit.add(1);
        stocksProfit.add(3);
        stocksProfit.add(9);
        long target = 47;
        int count = 0;
        for (int i = 0; i < stocksProfit.size(); i++) {
            String temp = "";
            // System.out.println(stocksProfit.get(i));
            for (int j = 0; j < stocksProfit.size(); j++) {
                // System.out.println(stocksProfit.get(j));
                if (i != j && stocksProfit.get(i) + stocksProfit.get(j) == target) {
                    int[] twoNumbers = new int[2];
                    twoNumbers[0] = stocksProfit.get(i);
                    twoNumbers[1] = stocksProfit.get(j);
                    Arrays.sort(twoNumbers);
                    if (!listOfDistinctStocks.contains(twoNumbers[0] + "," + twoNumbers[1])) {
                        System.out.println(twoNumbers[0] + "," + twoNumbers[1]);
                        listOfDistinctStocks.add(twoNumbers[0] + "," + twoNumbers[1]);
                        count++;
                    }
                    // System.out.println(stocksProfit.toString());

                }
            }
        }
        System.out.println(count);

        // loop 1
        // loop2
        // if(loop1 index + loop2index == target ){
        // remove loop 1 index and 2
        // }
        // until it cannot or until its empty
    }
}