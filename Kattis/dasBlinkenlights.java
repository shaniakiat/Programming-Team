import java.util.Scanner;

public class dasBlinkenlights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int s = sc.nextInt();

        boolean l1 = false;
        boolean l2 = false;

        boolean found = false;

        for (int i = 1; i <= s; i++) {
            if (i % p == 0) {
                // System.out.println(i%p);
                l1 = true;
            } else {
                l1 = false;
            }

            if (i % q == 0) {
                // System.out.println(i%q);
                l2 = true;
            } else {
                l2 = false;
            }
            if (l1 && l2) {
                found = true;
                break;
            } else {
                found = false;
            }
        }

        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}