
public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7, 7 };
        int[] smallers = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            smallers[i] = count;
            System.out.println(smallers[i]);
        }
    }
}