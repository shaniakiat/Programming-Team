import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp != 0) {
                nums[i] = 0;
                nums[a] = temp;
                a++;
            }
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}