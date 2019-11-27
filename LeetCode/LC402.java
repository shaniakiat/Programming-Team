import java.util.Scanner;

public class LC402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        String smallest = "";

        int length = num.length();

        for (int i = 0; i < length - k; i++) {
            String start = num.substring(0, i);
            String end = num.substring(i + k);
            String tempS = start + end;

            if (i == 0) {
                smallest = tempS;
            }
            // if (temp)

            if (tempS.compareTo(smallest) < 0) {
                smallest = tempS;
            }
        }

        if (smallest.length() == 0) {
            System.out.println(0);
        } else
            System.out.println("" + smallest);
        sc.close();
    }
}