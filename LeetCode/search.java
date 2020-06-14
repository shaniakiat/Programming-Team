public class search {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;

        int r = nums.length - 1;
        for (int l = 0; l <= nums.length / 2; i++) {
            if (nums[l] == target) {
                return l;
            } else if (nums[r] == target) {
                return r;
            }
            r--;
        }
    }
}