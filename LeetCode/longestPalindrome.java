import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class longestPalindrome {
    public static void main(String[] args) {
        String s = "aabbaa";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromTheMiddle(s, i, i);
            int len2 = expandFromTheMiddle(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }

        System.out.println(s.substring(start + 1, end));
    }

    public static int expandFromTheMiddle(String s, int left, int right) {

        if (s.length() == 0 || left > right) {
            return 0;
        }

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // aabbaa
        // 012345
        // 5-0+1

        return right - left + 1;
    }
}
