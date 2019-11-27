public class LC202 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // fetch starting time
        int n = 2;
        int realNum = n;
        boolean res = false;
        while (n != 1 && (System.currentTimeMillis() - startTime) < 1000) {
            int sum = 0;
            while (n > 0) {
                sum += (int) Math.pow((n % 10), 2);
                n = n / 10;
            }
            n = sum;
            System.out.println(n);
            if (n == realNum) {
                res = false;
                break;
            }
        }
        if (n == 1) {
            res = true;

        } else {
            res = false;
        }
        System.out.println(res);
    }
}