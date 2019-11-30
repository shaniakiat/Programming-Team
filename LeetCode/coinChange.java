import java.util.ArrayList;
import java.util.Arrays;

public class coinChange {
    public static void main(String[] args) {
        int[] coins = { 2 };
        int amount = 3;
        System.out.println(coinChangeMethod(coins, amount));
    }

    public static int coinChangeMethod(int[] coins, int amount) {
        int[] combinations = new int[amount + 1];

        Arrays.fill(combinations, amount + 1);
        combinations[0] = 0;
        for (int a = 1; a <= amount; a++) {
            for (int c = 0; c < coins.length; c++) {
                if (coins[c] <= a) {
                    combinations[a] = Math.min(combinations[a], combinations[a - coins[c]] + 1);
                }
            }
        }
        return combinations[amount] > amount ? -1 : combinations[amount];
    }
}