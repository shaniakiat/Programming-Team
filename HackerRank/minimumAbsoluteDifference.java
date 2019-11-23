import java.util.ArrayList;
import java.util.*;

public class minimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] a = { 1, -3, 71, 68, 17 };
        System.out.println(minimumAbsoluteDifferenceFunction(a));

    }

    public static int minimumAbsoluteDifferenceFunction(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // System.out.println(arr[i] + " - " + arr[j]);
                int abs = Math.abs(arr[i] - arr[j]);
                list.add(abs);
            }
        }
        Collections.sort(list);
        int res = list.get(0);
        return res;
    }
}