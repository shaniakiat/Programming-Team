import java.util.ArrayList;

public class countCharacters {
    public static void main(String[] args) {
        String[] words = { "cat", "bt", "hat", "tree" };
        String chars = "atach";
        String result = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < chars.length(); i++) {
            list.add(chars.charAt(i) + "");
        }

        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            boolean formed = true;
            ArrayList<String> currentList = new ArrayList<>(list);
            // System.out.println(current);
            for (int j = 0; j < current.length(); j++) {
                if (!currentList.contains(current.charAt(j) + "")) {
                    formed = false;
                    break;
                } else {
                    currentList.remove(current.charAt(j) + "");
                }

            }
            if (formed) {
                result += current;
            }
        }
        System.out.println(result);
    }
}