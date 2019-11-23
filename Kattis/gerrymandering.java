import java.text.DecimalFormat;
import java.util.*;

public class gerrymandering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int D = sc.nextInt();

        int[][] votes = new int[D][3];
        // getting which one is losing and pick that one
        // find the location is A or B
        double Vs = 0;
        for (int i = 0; i < P; i++) {
            int temp = sc.nextInt();
            votes[temp - 1][0] += sc.nextInt();
            votes[temp - 1][1] += sc.nextInt();
        }

        for (int i = 0; i < D; i++) {
            Vs += votes[i][0];
            Vs += votes[i][1];
        }
        // System.out.println(Vs);

        double countA = 0;
        double countB = 0;
        for (int i = 0; i < D; i++) {
            int A = votes[i][0];
            int B = votes[i][1];

            if (A > B) {
                System.out.print("A ");
                int calc = (int) Math.floor((A + B) / 2) + 1;
                A = A - calc;
                System.out.println(A + " " + B);
                countA += A;
                countB += B;
            } else {
                System.out.print("B " + A + " ");
                int calc = (int) Math.floor((A + B) / 2) + 1;
                B = B - calc;
                System.out.println(B);
                countA += A;
                countB += B;

            }
        }
        DecimalFormat df = new DecimalFormat("#.0000000000");
        double total = Math.abs(countA - countB) / Vs;
        System.out.println(df.format(total));
        sc.close();
    }
}