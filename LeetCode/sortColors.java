import java.util.ArrayList;
import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        ArrayList<Integer> zeros = new ArrayList<>();
        ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> twos = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros.add(0);
            } else if (nums[i] == 1) {
                ones.add(1);
            } else {
                twos.add(2);
            }
        }

        res.addAll(zeros);
        res.addAll(ones);
        res.addAll(twos);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res.get(i);
        }

        System.out.println(Arrays.toString(nums));
    }
}