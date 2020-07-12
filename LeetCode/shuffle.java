import java.util.ArrayList;

public class shuffle {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
            list.add(nums[i + n]);
        }

        int[] result = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            result[i] = list.get(i);
            // System.out.println(result[i]);
        }
    }
}