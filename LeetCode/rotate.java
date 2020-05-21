public class rotate {
    public static void main(String[] args) {
        int[] nums = { -1, -100, 3, 99 };
        int k = 2;

        while (k > 0) {
            int last = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
            k--;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}