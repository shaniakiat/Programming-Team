import java.util.ArrayList;

public class reverseOnlyLetters {
    public static void main(String[] args) {
        String S = "a-bC-dEf-ghIj";
        char[] charS = S.toCharArray();
        char[] notS = new char[charS.length];
        S = "";
        String reversed = "";
        ArrayList<Character> list = new ArrayList<>();

        String res = "";
        for (int i = 0; i < charS.length; i++) {
            int temp = (int) charS[i];
            if ((temp >= 48 && temp <= 57) || (temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122)) {
                S += (char) temp;
            } else {
                notS[i] = (char) temp;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            list.add(S.charAt(i));
        }

        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {

            if ("" + notS[i] != null) {
                res += notS[i];
            }
            res += list.get(i);
        }
        System.out.println(res);
    }
}