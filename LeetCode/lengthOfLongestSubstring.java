import java.util.ArrayList;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = " ";

        ArrayList<String> list = new ArrayList<>();

        String substring = "";
        int left = 0;
        int right = 0;

        if (s.length() == 1) {
            list.add(s);
        } else {
            while (left < s.length() && right < s.length()) {
                String c = s.charAt(right) + "";

                // if the substring doesnt contains the character and it reaches the end of the
                // length
                // just add the character to the subtring & add the subtring to the list
                // increment both pointers
                if (!substring.contains(c) && right == s.length() - 1) {
                    substring += c;
                    list.add(substring);
                    left++;
                    right = left;
                    substring = "";
                }
                // if the subtring does contain the character
                // dont add the charcter to the substring, and push the subtring to the list
                // increment both pointers
                else if (substring.contains(c)) {
                    list.add(substring);
                    left++;
                    right = left;
                    substring = "";
                }
                // just keep adding the character to the substring
                // increment the right pointer
                else {
                    substring += c;
                    right++;
                }
            }
        }

        System.out.println(list);
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int l = list.get(i).length();
            if (l > max) {
                max = l;
            }
        }
        System.out.println(max);
    }
}