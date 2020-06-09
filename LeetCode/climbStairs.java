import java.util.ArrayList;

public class climbStairs {
    public static void main(String[] args) {
        int n = 9;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                list.add(1);
            } else if (i == 1 || i == 2 || i == 3) {
                list.add(i);
            } else {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
        }
        System.out.println(list.get(list.size() - 1));
    }
}