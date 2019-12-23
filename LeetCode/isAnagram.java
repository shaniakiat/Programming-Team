import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] a = s.toCharArray();
        Arrays.sort(a);

        char[] b = t.toCharArray();
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}