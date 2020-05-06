import java.util.ArrayList;
import java.util.Arrays;

public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        ArrayList<Boolean> res = new ArrayList<>();

        int[] newCandies = candies.clone();

        Arrays.sort(candies);
        int greatest = candies[candies.length - 1];

        int i = 0;
        while (i < candies.length) {
            int withExtra = newCandies[i] + extraCandies;
            if (withExtra >= greatest) {
                res.add(true);
            } else {
                res.add(false);
            }
            i++;
        }
        System.out.println(res.toString());
    }
}