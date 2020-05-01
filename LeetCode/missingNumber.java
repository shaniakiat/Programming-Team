import java.util.ArrayList;
import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        ArrayList<Integer> list = new ArrayList<>(nums.length);

        for (int i : nums) {
            list.add(Integer.valueOf(i));
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {

            }
        }
    }
}