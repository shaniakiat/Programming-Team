public class addDigits {
    public static void main(String[] args) {
        int num = 77;
        String s = "" + num;

        while (s.length() > 1) {
            num = 0;
            String[] nums = s.split("");
            for (int i = 0; i < nums.length; i++) {
                num += Integer.parseInt(nums[i]);
            }
            s = "" + num;
        }

        System.out.println(num);
    }
}