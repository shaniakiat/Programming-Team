import java.util.Scanner;

// https://open.kattis.com/problems/avion

public class avion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean away = false;
        int count = 0;
        String c = "";
        while (sc.hasNext() && away == false) {
            count++;
            String w = sc.next();
            if (w.contains("CIA")) {
                away = true;
            }
            if (w.contains("FBI")) {
                c = c + count + " ";
            }
        }

        if (away == true) {
            System.out.println("HE GOT AWAY!");
        } else {
            System.out.print(c);
        }
    }
}