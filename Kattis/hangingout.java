import java.util.Scanner;

public class hangingout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int event = sc.nextInt();

        // int l = 4;
        // int event = 5;
        int in = 0;
        int denied = 0;

        for (int i = 0; i < event; i++) {
            String x = sc.next();

            if (x.equals("enter")) {
                int enter = sc.nextInt();
                if (in + enter > l) {
                    denied++;
                } else {
                    in = in + enter;
                }
            }
            if (x.equals("leave")) {
                int leave = sc.nextInt();
                in = in - leave;
            }
        }
        System.out.println(denied);
    }
}