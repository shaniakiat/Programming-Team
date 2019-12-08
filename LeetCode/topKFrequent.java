import java.util.ArrayList;
import java.util.HashMap;

public class topKFrequent {
    public static void main(String[] args) {
        int[] nums = { 1 };
        int k = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println(map.toString());

        for (int i = 0; i < k; i++) {
            int max = Integer.MIN_VALUE;
            int res = 0;
            for (int n : map.keySet()) {
                // System.out.println("key: " + n);
                int v = map.get(n);
                // System.out.println("val: " + v);
                if (v > max) {
                    max = Math.max(max, v);
                    res = n;
                }
            }
            // System.out.println(res);
            // list.add(res);
            // map.remove(res);
        }
        System.out.println(list.toString());
    }
}