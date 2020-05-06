public class findNumbers {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            String s = nums[i] + "";
            if (s.length() % 2 == 0) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}