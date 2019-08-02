public class LC507 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(99999991));
    }

    public static boolean checkPerfectNumber(int num) {
        long res = 0;
        long actual_num = num;
        boolean equal = false;
        for (long i = 1; i < actual_num; i++) {
            if (actual_num % i == 0) {
                // System.out.println(i);
                res += i;
            }
        }
        if (res == num) {
            equal = true;
        }
        return equal;
    }
}
