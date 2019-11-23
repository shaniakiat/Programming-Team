import java.util.Arrays;

class sockMerchant {
    public static void main(String[] args) {
        int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

        Arrays.sort(ar);
        int s = ar.length;
        for (int i = 0; i < s - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                ar[i] = -100;
                ar[i + 1] = -100;
                i++;
            }
        }
        int c = 0;
        for (int i = 0; i < s; i++) {
            // System.out.println(ar[i]);
            if (ar[i] == -100) {
                c++;
            }
        }
        return c;

    }
}