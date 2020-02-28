import java.util.Scanner;

class chanukah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
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
        for (int i = 0; i < p; i++) {
            int count = sc.nextInt();
            int holidays = sc.nextInt();
            int candles = 0;
            int shammas = 1;
            for (int days = 1; days <= holidays; days++) {
                candles = candles + days + shammas;
            }
            System.out.println(count + " " + candles);
        }
    }
}