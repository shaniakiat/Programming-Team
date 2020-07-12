import java.util.Scanner;

// https://open.kattis.com/problems/quickestimate

class quickestimate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine() + "";
            System.out.println(s.length());
        }

    }
}