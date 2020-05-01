import java.util.ArrayList;

public class countSmaller {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 6, 1 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (i != nums.length - 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        count++;
                    }
                }
            }
            list.add(i, count);
        }
        System.out.println(list.toString());
    }
}