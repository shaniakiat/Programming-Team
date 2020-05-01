import java.util.ArrayList;

public class sortArrayByPartityII {

    public static void main(String[] args) {
        int[] A = { 4, 2, 5, 7 };
        int[] res = new int[A.length];
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evens.add(A[i]);
            } else {
                odds.add(A[i]);
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                res[i] = evens.get(i / 2);
                System.out.println(evens.get(i / 2));
            } else {
                res[i] = odds.get(i / 2);
                System.out.println(odds.get(i / 2));

            }
        }
        return res;

    }
}