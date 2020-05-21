public class isPalindrome {
    public static void main(String[] args) {
        String s = "race car";
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) ch[i];
            if ((temp >= 97 && temp <= 122) || (temp >= 48 && temp <= 57)) {
                str += ch[i];
            }
        }
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}