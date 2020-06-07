import java.util.ArrayList;
import java.util.HashMap;

public class isIsomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        HashMap<Character, Character> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char tempS = s.charAt(i);
            char tempT = t.charAt(i);
            if (map.containsKey(tempS)) {
                if (map.get(tempS) != tempT) {
                    return false;
                }
            } else {
                if (list.contains(tempT)) {
                    return false;
                } else {
                    map.put(tempS, tempT);
                    list.add(tempT);
                }
            }
        }
        return true;
    }
}