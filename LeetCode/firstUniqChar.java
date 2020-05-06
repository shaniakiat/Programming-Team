import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstUniqChar {
    public static void main(String[] args) {
        String s = "leetcode";
        int res = -1;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        char indexChar = '0';
        for (int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            if (map.containsKey(tempChar)) {
                map.put(tempChar, map.get(tempChar) + 1);
            } else {
                map.put(tempChar, 1);
            }
        }
        System.out.println(map.toString());

        for (char n : map.keySet()) {
            int v = map.get(n);
            if (v == 1) {
                indexChar = n;
                break;
                // System.out.println(n);
            }
        }
        if (s.contains("" + indexChar)) {
            return s.indexOf("" + indexChar);
        } else
            return res;
    }
}