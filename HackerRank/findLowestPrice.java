import java.util.ArrayList;
import java.util.Collections;

public class findLowestPrice {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> products = new ArrayList<>();
        ArrayList<ArrayList<String>> discounts = new ArrayList<>();

        ArrayList<String> p1 = new ArrayList<>();
        p1.add("10");
        p1.add("d0");
        p1.add("d1");
        ArrayList<String> p2 = new ArrayList<>();
        p2.add("15");
        p2.add("EMPTY");
        p2.add("EMPTY");
        ArrayList<String> p3 = new ArrayList<>();
        p3.add("20");
        p3.add("d1");
        p3.add("EMPTY");

        products.add(p1);
        products.add(p2);
        products.add(p3);

        ArrayList<String> d0 = new ArrayList<>();
        d0.add("d0");
        d0.add("1");
        d0.add("27");

        ArrayList<String> d1 = new ArrayList<>();
        d1.add("d1");
        d1.add("2");
        d1.add("5");

        discounts.add(d0);
        discounts.add(d1);

        int res = 0;
        // looping all the products
        for (int i = 0; i < products.size(); i++) {
            int price = Integer.parseInt(products.get(i).get(0));
            // int[] pricesCount = new int[products.size()];
            ArrayList<Integer> dicountsCount = new ArrayList<>();
            System.out.println("price: " + price);
            // looping all the discounts on the products
            for (int j = 0; j < products.get(i).size(); j++) {
                String discountTag = products.get(i).get(j);
                System.out.println("discountTag: " + discountTag);

                // looping the discounts array

                for (int k = 0; k < discounts.size(); k++) {
                    // get a discount
                    if (discounts.get(k).contains(discountTag)) {
                        int currentPrice = price;
                        int type = Integer.parseInt(discounts.get(k).get(1));
                        int amount = Integer.parseInt(discounts.get(k).get(2));
                        System.out.println("type: " + type);
                        System.out.println("amount: " + amount);
                        if (type == 1) {
                            currentPrice = (int) Math.floor(currentPrice * (100 - amount) / 100);

                        } else if (type == 2) {
                            currentPrice = currentPrice - amount;
                        }
                        dicountsCount.add(currentPrice);
                        System.out.println("currPRice: " + currentPrice);
                        dicountsCount.toString();
                    }

                    // price = Math.min(price, currentPrice);
                    // System.out.println("lower price: " + price);
                }

            }
            Collections.sort(dicountsCount);
            if (dicountsCount.size() > 0) {
                price = dicountsCount.get(0);
            }

            res = res + price;
        }

        // type 1: price * ( 100 - amount)/100 round down to integer
        // type 2: price - amount
        // type 0: price * (100-amount)/100
        System.out.println(res);
        System.out.println(discounts.get(0).contains("d0"));

    }
}