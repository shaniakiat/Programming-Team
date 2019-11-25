import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class mostCommonWord {
    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = { "a" };
        List<String> bannedList = Arrays.asList(banned);
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
        // System.out.println(words[words.length - 1]);
        String word = "";
        for (int i = 0; i < words.length; i++) {
            word = words[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int v;
        String res = "";
        for (String k : map.keySet()) {
            // System.out.println("key: " + name);
            if (!bannedList.contains(k)) {
                v = map.get(k);
                if (v >= max) {
                    max = Math.max(max, v);
                    res = k;
                }

            }
        }
        System.out.println(res);
    }
}