import java.util.*;

public class chanukah2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1: 2
        // 2: 5
        // 3: 9
        // 4: 14
        // 5: 20
        // 6: 27
        // 7: 35
        // 8: 44
        // 9: 54
        // 10: 65
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            sc.nextInt();
            int h = sc.nextInt();
            int candles = 0;
            int shammas = 1; // extra candle
            for (int day = 1; day <= h; day++) {
                candles = candles + day + shammas;
            }
            System.out.println(candles);
        }
        sc.close();
    }
}