import java.util.*;

public class stringMatching {
    public static void main(String[] args) {
        // String[] words = { "mass", "as", "hero", "superhero" };
        String[] words = { "blue", "green", "bu" };
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j != i && words[i].contains(words[j]) && !array.contains(words[j])) {
                    array.add(words[j]);
                }
            }
        }

        System.out.println(array.toString());
    }
}