import java.util.Arrays;

public class isAnagram1 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        String[] arrS = s.split("");
        String[] arrT = s.split("");

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        if (Arrays.equals(arrS, arrT)) {
            return true;
        } else {
            return false;
        }
    }
}