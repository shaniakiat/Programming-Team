import java.util.*;

public class uncommon {
    public static void main(String[] args) {
        String A = "apple apple";
        String B = "banana ";
        String[] result = uncommonFromSentences(A, B);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> temp = new ArrayList<>();
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        // using split method to convert String to array
        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");

        int newValue = 0;
        for (int i = 0; i < arrayA.length; i++) {
            String word = arrayA[i];
            // if the map contains the word
            if (count.containsKey(word)) {
                // increase the value by one
                newValue = count.get(word) + 1;
                // put the new value into the key
                count.put(word, newValue);
            } else {
                count.put(word, 1);
            }
        }

        for (int i = 0; i < arrayB.length; i++) {
            String word = arrayB[i];
            // if the map contains the word
            if (count.containsKey(word)) {
                // increase the value by one
                newValue = count.get(word) + 1;
                // put the new value into the key
                count.put(word, newValue);
            } else {
                count.put(word, 1);
            }
        }
        // loop all the keys and check if its value equals to 1
        for (String key : count.keySet()) {
            // System.out.println(key);
            if (count.get(key) == 1) {
                temp.add(key);
                System.out.println(key);
            }
        }
        // convert array list to regular array
        String[] result = temp.toArray(new String[temp.size()]);
        return result;
    }
}

// ACTUAL SOLUTION

// class Solution {
// public String[] uncommonFromSentences(String A, String B) {
// Map<String, Integer> count = new HashMap();
// for (String word : A.split(" "))
// count.put(word, count.getOrDefault(word, 0) + 1);
// for (String word : B.split(" "))
// count.put(word, count.getOrDefault(word, 0) + 1);

// List<String> ans = new LinkedList();
// for (String word : count.keySet())
// if (count.get(word) == 1)
// ans.add(word);

// return ans.toArray(new String[ans.size()]);
// }
// }
