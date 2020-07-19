import java.util.ArrayList;
import java.util.HashMap;

public class createTargetArray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int numIndex = index[i];

            list.add(numIndex, num);
        }

        int[] res = list.stream().mapToInt(i -> i).toArray();
    }
}