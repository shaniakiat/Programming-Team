import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class countTriplets {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 7 };

        // Arrays.sort(arr);

        // System.out.println(arr[0]);

        for (int a = 0; a < arr.length - 3; a++) {
            int i = a;
            int j = a + 1;
            int k = a + 2;

            int m = 1;
            for (int b = i; b <= j; b++) {
                m ^= arr[b];
            }
        }
    }
}