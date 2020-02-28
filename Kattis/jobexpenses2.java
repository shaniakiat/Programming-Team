import java.util.*;

public class jobexpenses2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // negative: expenses
        // positive: income
        int totalExpenses = 0;
        for (int i = 0; i < n; i++) {
            int e = sc.nextInt();
            if (e < 0) {
                totalExpenses += e;
            }
        }
        System.out.println(Integer.parseInt("" + Math.abs(totalExpenses)));
    }
}