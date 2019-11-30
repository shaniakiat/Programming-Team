import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstUniqChar {
    public static void main(String[] args) {
        String s = "cc";
        char[] c = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < c.length; i++) {
            map.put(c[i], map.getOrDefault(c[i], 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        char letter = 'l';
        for (char l : map.keySet()) {
            if (map.get(l) <= min) {
                min = map.get(l);
                letter = l;
            }
        }
        if (min > 0) {
            return -1;
        } else {
            return s.indexOf(letter);
        }
        System.out.println(min);
        System.out.println(map.toString());
        System.out.println(s.indexOf(letter));
    }
}