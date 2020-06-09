import java.util.ArrayList;

public class tribonacci {
    public static void main(String[] args) {

        int n = 4;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                list.add(0);
                System.out.println(list.toString());
            } else if (i == 1 || i == 2) {
                list.add(1);
                System.out.println(list.toString());
            } else {
                list.add(list.get(i - 1) + list.get(i - 2) + list.get(i - 3));
                // System.out.println(list.get(i - 1));
                // System.out.println(list.get(i - 2));
                // System.out.println(list.get(i - 3));
            }
            // System.out.println(list.toString());
        }
        System.out.println(list.get(list.size() - 1));
    }
}