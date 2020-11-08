public class rob {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        int money1 = 0;
        int money2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(nums[i] + money1, money2);
            money1 = money2;
            money2 = temp;
        }
        return money2;
    }
}
