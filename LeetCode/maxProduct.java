public class maxProduct {
    public static void main(String[] args) {

    }

    public int maxProductFunction(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int val1 = nums[i];
            int val2 = nums[i + 1];
            int curr = (val1 - 1) * (val2 - 1);
            if (curr >= max) {
                max = curr;
            }
        }
        return max;
    }
}
