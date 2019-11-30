public class balancedStringSplit {
    public static void main(String[] args) {
        String S = "RLRRLLRLRL";
        int count = 0;
        int tempS = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'R') {
                tempS++;
            } else {
                tempS--;
            }
            if (tempS == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}