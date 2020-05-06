import java.util.ArrayList;
import java.util.HashMap;

public class findSpecialInteger {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };

        int twentyFive = arr.length / 4;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(twentyFive);
        System.out.println(map.toString());
        int res = 0;
        for (int k : map.keySet()) {
            int j = map.get(k);
            if (j > twentyFive) {
                res = k;
            }
        }
        System.out.println(res);
    }
}