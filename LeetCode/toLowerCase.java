public class toLowerCase {
    public static void main(String[] args) {

        String s = "LOVELY";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.charAt(i);
            if (temp >= 65 && temp <= 90) {
                temp = temp + 32;

            }
            res = res + (char) temp;
        }
        System.out.println(res);
    }
}