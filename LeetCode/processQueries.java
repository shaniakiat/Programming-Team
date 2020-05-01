import java.util.ArrayList;

public class processQueries {

    public static void main(String[] args) {
        // int[] queries = { 3, 1, 2, 1 };
        // int m = 5;

        int[] queries = { 7, 5, 5, 8, 3 };
        int m = 8;

        ArrayList<Integer> P = new ArrayList<>();
        int[] fin = new int[queries.length];

        for (int i = 0; i < m; i++) {
            P.add(i + 1);
        }
        System.out.println(P.toString());

        for (int i = 0; i < queries.length; i++) {
            if (P.contains(queries[i])) {
                // System.out.println("query: " + queries[i]);
                int res = P.indexOf(queries[i]);
                P.remove(Integer.valueOf(queries[i]));
                // System.out.println("remove: " + P.remove(Integer.valueOf(queries[i])));
                P.add(0, queries[i]);
                fin[i] = res;
                System.out.println(res);
                // System.out.println(P.toString());
            }
        }
    }
}