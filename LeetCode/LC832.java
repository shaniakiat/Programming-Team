
public class LC832 {
    public static void main(String[] args) {
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        flipAndInvertImage(A);
    }

    public static int[][] flipAndInvertImage(int[][] A) {

        // System.out.println(A[0].length);

        int[][] B = new int[A.length][A.length];
        int[][] C = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] == 0) {
                    B[i][j] = 1;
                } else {
                    B[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            int a = 0;
            for (int j = A.length - 1; j >= 0; j--) {
                C[i][j] = B[i][a];
                a++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(C[i][j]);
            }
            System.out.println();
        }

        return null;
    }

}
