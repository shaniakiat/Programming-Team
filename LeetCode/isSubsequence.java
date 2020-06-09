public class isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        for (int i = 0; i < s.length(); i++) {
            String c = s.charAt(i) + "";
            if (t.contains(c)) {
                int index = t.indexOf(c);
                // System.out.println(index);
                t = t.substring(index + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}