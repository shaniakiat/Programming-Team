public class diStringMatch {
    public static void main(String[] args) {
        String S = "DDI";
        int l = S.length();
        int[] A = new int[l + 1];
        int least = 0;
        int most = l;
        // System.out.println(res.length);
        for (int i = 0; i < l; i++) {
            if (S.charAt(i) == 'I') {
                A[i] = least;
                least++;
            } else {
                A[i] = most;
                most--;
            }
        }
        A[l] = least;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}