import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<String> sortedStrs = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            sortedStrs.add(String.valueOf(temp));
        }

        for (int i = 0; i < strs.length; i++) {
            String sortedStr = sortedStrs.get(i);
            String actualStr = strs[i];
            if (!map.containsKey(sortedStr)) {
                List<String> temp = new ArrayList<>();
                temp.add(actualStr);
                map.put(sortedStr, temp);
            } else {
                List<String> listFromMap = map.get(sortedStr);
                listFromMap.add(actualStr);
                map.put(sortedStr, listFromMap);
            }
        }
        // System.out.println(map.toString());

        for (String s : map.keySet()) {
            List<String> temp = map.get(s);
            list.add(temp);
        }

        System.out.println(list.toString());
    }
}