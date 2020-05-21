import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean dups = false;
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                dups = true;
                break;
            } else {
                list.add(nums[i]);
            }
        }

        System.out.println(dups);
    }
}