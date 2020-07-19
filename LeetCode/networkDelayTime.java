import java.util.Arrays;
import java.util.Comparator;

public class networkDelayTime {
    public static void main(String[] args) {
        int[][] times = { { 1, 2, 1 }, { 2, 1, 3 } };
        int N = 2;
        int K = 2;

        int totalW = 0;
        int totalW2 = 0;
        int v = 0;
        int v2 = 0;

        for (int i = 0; i < times.length; i++) {
            if (v == times[i][0] && times[i][0] == N) {

            } else if (K != times[i][0] && totalW != 0 && v == times[i][0]) {
                v = times[i][1];
                totalW += times[i][2];
            } else if (K == times[i][0] && totalW != 0) {
                v = times[i][1];
                totalW = times[i][2];
            } else if (K == times[i][0]) {
                v = times[i][1];
                totalW += times[i][2];

            }
        }

        for (int i = times.length - 1; i >= 0; i--) {
            if (v2 == times[i][0] && times[i][1] == N) {
                System.out.println("hi:" + totalW2);
            } else if (K != times[i][0] && totalW2 != 0 && v2 == times[i][0]) {

                v2 = times[i][1];
                totalW2 += times[i][2];

                System.out.println("bo:" + totalW2);
            } else if (K == times[i][0] && totalW2 != 0) {
                v2 = times[i][1];
                totalW2 = times[i][2];
                System.out.println(totalW2);
            } else if (K == times[i][0]) {
                v2 = times[i][1];
                totalW2 += times[i][2];
                System.out.println(v2);
                System.out.println(totalW2);
            }
        }

        if (totalW != -1 || totalW != -1) {
            if (v == N) {
                System.out.println(totalW);
            } else {
                System.out.println(totalW2);
            }
        } else {
            System.out.println(-1);
        }

    }
}