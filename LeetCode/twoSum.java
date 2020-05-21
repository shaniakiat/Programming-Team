public class twoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        int target = 6;
        int[] res = new int[2];
        int a = 0;
        for (int i = a; i < nums.length;) {
            int x = nums[a];
            i++;
            if ((target - x) == nums[i]) {
                System.out.println(i);
                res[0] = a;
                res[1] = i;
                break;
            }
            System.out.println(i);

            System.out.println(nums.length);
            if (i == nums.length - 1) {
                System.out.println("here");
                a += 1;
                i = a;
            }
        }

        System.out.println(res[0] + ", " + res[1]);
    }
}