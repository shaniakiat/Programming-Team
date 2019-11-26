public class twoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = nums[i];
                    res[1] = nums[j];
                }
            }
        }
        System.out.println(res[0] + ", " + res[1]);
    }
}