import java.util.Arrays;
import java.util.HashMap;

public class singleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 8, 8 };

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < length; i++) {
        // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }

        // for(int n : map.keySet()){
        // if(map.get(n) == 1){
        // return n;
        // }
        // }
        // System.out.println(map.toString());

        // if they're equal, the singleNum is on the first half
        // if they're not equal, the singleNum is on the second half

        // System.out.println(Arrays.copyOfRange(nums, 0, length / 2).length);

        int length = nums.length;
        while (length > 0) {
            // 1 1 2 3 3 4 4 8 8;
            if (length == 1) {
                return nums[0];
            } else if (length == 3) {
                if (nums[0] == nums[1]) {
                    return nums[2];
                } else if (nums[1] == nums[2]) {
                    return nums[0];
                } else if (nums[0] == nums[2]) {
                    return nums[1];
                }
            } else if (length % 2 == 0) {
                if (nums[length / 2 - 1] != nums[length / 2]) {
                    nums = Arrays.copyOfRange(nums, length / 2, length - 1);
                } else if (nums[length / 2 - 1] == nums[length / 2]) {
                    nums = Arrays.copyOfRange(nums, 0, length / 2 - 1);
                }
            } else {
                if (nums[length / 2 - 1] == nums[length / 2]) {
                    nums = Arrays.copyOfRange(nums, length / 2, length - 1);
                } else if (nums[length / 2 - 1] == nums[length / 2]) {
                    nums = Arrays.copyOfRange(nums, 0, length / 2 - 1);
                }
            }

        }
    }
}