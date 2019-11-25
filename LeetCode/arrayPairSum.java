import java.util.Arrays;

public class arrayPairSum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2 };

        Arrays.sort(arr);
        // System.out.println(arr[1]);
        int res = 0;
        for (int i = 0; i < arr.length; i += 2) {
            res += Math.min(arr[i], arr[i + 1]);
        }
        System.out.println(res);
    }
}