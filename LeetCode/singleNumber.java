import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int res = 0;
        for (int n : map.keySet()) {
            int v = map.get(n);
            if (v < min) {
                min = Math.min(min, v);
                res = n;
            }
        }
        System.out.println(res);
    }
}