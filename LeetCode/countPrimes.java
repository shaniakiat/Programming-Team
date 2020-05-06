public class countPrimes {
    public static void main(String[] args) {
        int n = 499979;

        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean isNotPrime = false;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0 && j != 1 && j != i) {
                    isNotPrime = true;
                    break;

                }
            }
            if (isNotPrime == false && i != 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}