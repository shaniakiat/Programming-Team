import java.util.ArrayList;
import java.util.HashMap;

class uniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> occurrence = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // System.out.println(map.toString());
        boolean unique = true;
        for (int n : map.keySet()) {
            // System.out.println("key: " + n);
            int v = map.get(n);
            if (!occurrence.contains(v)) {
                occurrence.add(v);
            } else {
                unique = false;
            }
        }
        System.out.println(unique);
    }
}