public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int res = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (res < 0) {
                res = nums[i];
            } else {
                res += nums[i];
            }
            max = Math.max(res, max);
        }

        System.out.println(max);

    }
}