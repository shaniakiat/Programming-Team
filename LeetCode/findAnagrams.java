import java.util.ArrayList;
import java.util.Arrays;

public class findAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        char[] check = p.toCharArray();
        Arrays.sort(check);

        String word = "";
        ArrayList<Integer> res = new ArrayList<>();
        int sL = s.length();
        int pL = p.length();
        for (int i = 0; i <= sL - pL; i++) {
            // System.out.println(s.substring(i, i + pL));
            word = s.substring(i, i + pL);
            char[] temp = word.toCharArray();

            Arrays.sort(temp);

            if (Arrays.equals(temp, check)) {
                res.add(i);
            }
        }
        System.out.println(res.toString());
    }
}