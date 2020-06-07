import java.util.ArrayList;
import java.util.HashMap;

public class wordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        String[] arr = str.split(" ");
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>(); // keep track the value of the map

        // if the lengths are different then false
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {

            String tempKey = pattern.charAt(i) + "";

            // if the map contains one of the character from the pattern
            if (map.containsKey(tempKey)) {
                String tempVal = map.get(tempKey);
                // check if the value is equal
                if (!tempVal.equals(arr[i])) {
                    System.out.println(arr[i]);
                    return false;
                }
            }

            // if the map doesn't contain the character
            else {
                // check if the value is already in the list
                // if it is, then there is a duplication value then return false
                if (list.contains(arr[i])) {
                    return false;
                } else {
                    map.put(tempKey, arr[i]);
                    list.add(arr[i]);
                }

            }
        }
        return true;
    }
}