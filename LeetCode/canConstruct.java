public class canConstruct {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        boolean check = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!magazine.contains("" + ransomNote.charAt(i))) {
                check = false;
            } else {
                magazine.indexOf(ransomNote.charAt(i));
                StringBuilder sb = new StringBuilder(magazine);
                sb.deleteCharAt(magazine.indexOf(ransomNote.charAt(i)));
                magazine = sb.toString();
                // System.out.println(magazine);
            }
        }
        System.out.println(check);
    }
}