
public class isMonotonic {
    public static void main(String[] args) {
        int[] A = { 1, 1, 0 };

        boolean itIs = false;

        int countIncrease = 0;
        int countDecrease = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                countDecrease++;
            }
            if (A[i] < A[i + 1]) {
                countIncrease++;
            }
        }

        if (countDecrease == 0 || countIncrease == 0) {
            itIs = true;
        }

        System.out.println(itIs);
    }

}