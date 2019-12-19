public class transpose {
    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] res = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[j][i] = A[i][j];
            }
        }
        // // test
        // for (int i = 0; i < A.length; i++) {
        // for (int j = 0; j < A[0].length; j++) {
        // System.out.print(res[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}