import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class largestNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 30, 34, 5, 9 };
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int digit = Integer.parseInt((nums[i] + "").charAt(0) + "");
            if (map.containsKey(digit)) {
                ArrayList<Integer> temp = map.get(digit);
                temp.add(nums[i]);
                Collections.sort(temp, Collections.reverseOrder());
                map.put(digit, temp);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                Collections.sort(temp, Collections.reverseOrder());
                map.put(digit, temp);
            }
        }
        Map<Integer, ArrayList<Integer>> map2 = new TreeMap<Integer, ArrayList<Integer>>(Collections.reverseOrder());
        map2.putAll(map);
        // System.out.println(map2.toString());
        ArrayList<Integer> arrayResult = new ArrayList<>();
        for (Integer key : map2.keySet()) {
            arrayResult.addAll(map2.get(key));
        }
        // System.out.println(arrayResult.toString());
        String s = "";
        for (int i = 0; i < arrayResult.size(); i++) {
            s += arrayResult.get(i);
        }
        System.out.println(s);
    }
}