import java.util.ArrayList;

public class coinChange {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        ArrayList<Integer> listCoins = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            listCoins.add(coins[i]);
        }
        System.out.println(listCoins.toString());

        int count = 0;
        while (amount > 0) {
            if (amount > listCoins.get(listCoins.size() - 1)) {
                amount = amount - listCoins.get(listCoins.size() - 1);
                System.out.println(amount);
                count++;
            } else {
                if (listCoins.size() > 0)
                    listCoins.remove(listCoins.size() - 1);
            }
        }
        System.out.println(count);
    }

    public static int coinChangeMethod(int[] coins, int amount) {
        int[] combinations = new int[amount + 1];
        for (int c = 0; c < coins.length; c++) {
            for (int a = 0; a < amount; a++) {
                if (a >= coins[c]) {
                    combinations[a] += combinations[a - c];
                }
            }
        }

        return 0;

    }
}