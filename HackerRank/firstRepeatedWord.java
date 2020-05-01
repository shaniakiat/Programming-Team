import java.util.*;

public class firstRepeatedWord {
    public static void main(String[] args) {
        // read each string and add to map, if the word is repeated twice, break and
        // return that word.

        // Scanner sc = new Scanner(System.in);
        // String[] words = sc.nextLine().split(" ");
        String s = "He had Had quite. enough    quite of this nonsense.".replaceAll("[.,:;]", "");

        String[] words = s.split("\\s+");
        String result = "";
        ArrayList<String> listOfWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String aWord = words[i];
            if (!listOfWords.contains(aWord)) {
                listOfWords.add(aWord);
            } else {
                result = aWord;
                break;
            }

        }
        System.out.println(s);
        System.out.println(listOfWords.toString());
        System.out.println(result);

    }
}