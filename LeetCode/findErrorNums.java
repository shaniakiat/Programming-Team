import java.util.ArrayList;

public class findErrorNums {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 2 };
        ArrayList<Integer> list = new ArrayList<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (list.contains(n)) {
                res[0] = i + 1;
                res[1] = n;
            } else {
                list.add(n);
            }
        }

        System.out.println(res[0] + ", " + res[1]);
    }
}