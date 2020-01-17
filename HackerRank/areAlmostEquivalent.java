import java.util.ArrayList;
import java.util.HashMap;

public class areAlmostEquivalent {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("aabaab");
        s.add("aaaabb");
        ArrayList<String> t = new ArrayList<>();
        t.add("bbabbc");
        t.add("abb");
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).length() != t.get(i).length()) {
                // System.out.print("False");
                res.add("NO");
            } else {
                HashMap<Character, Integer> mapS = new HashMap<>();
                HashMap<Character, Integer> mapT = new HashMap<>();

                String strS = s.get(i);
                String strT = t.get(i);

                for (int j = 0; j < strS.length(); j++) {
                    mapS.put(strS.charAt(j), mapS.getOrDefault(strS.charAt(j), 0) + 1);
                    mapT.put(strT.charAt(j), mapT.getOrDefault(strT.charAt(j), 0) + 1);
                }

                int lengthS = mapS.size();
                int lengthT = mapS.size();
                HashMap<Character, Integer> mapLarger = new HashMap<>();
                HashMap<Character, Integer> mapSmaller = new HashMap<>();
                if (lengthS >= lengthT) {
                    mapLarger.putAll(mapS);
                    mapSmaller.putAll(mapT);
                } else {
                    mapLarger.putAll(mapT);
                    mapSmaller.putAll(mapS);
                }
                boolean moreThanThree = false;
                for (char w : mapLarger.keySet()) {
                    int diff = 0;
                    if (mapSmaller.containsKey(w)) {
                        // find the differences
                        diff = Math.abs(mapLarger.get(w) - mapSmaller.get(w));
                        if (diff > 3) {
                            moreThanThree = true;
                        }
                    }
                }
                if (moreThanThree)
                    res.add("NO");
                else
                    res.add("YES");
            }
        }
        System.out.println(res.toString());
    }
}