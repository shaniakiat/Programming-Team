import java.util.HashMap;

public class mostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        // System.out.println(words[words.length - 1]);
        for (int i = 0; i < words.length; i++) {

        }
    }
}