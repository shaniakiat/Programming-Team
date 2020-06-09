import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // System.out.println(map.toString());

        int max = Integer.MIN_VALUE;
        for (int n : map.keySet()) {
            int v = map.get(n);
            if (v >= max) {
                max = n;
            }
        }

        System.out.println(max);
    }
}