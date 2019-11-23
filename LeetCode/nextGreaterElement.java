import java.util.*;
import java.util.stream.Collectors;

// https://leetcode.com/problems/next-greater-element-i/
public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        int[] res = getNextGreaterElement(nums1, nums2);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] getNextGreaterElement(int[] nums1, int[] nums2) {
        boolean found = false;
        int[] res = new int[nums1.length];
        List<Integer> arr = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        for (int i = 0; i < nums1.length; i++) {
            int num = 0;
            int curr = nums1[i];
            int l = arr.size();
            for (int j = i; j < l; j++) {
                int temp = arr.get(j);
                if (curr < temp) {
                    found = true;
                    num = temp;
                    arr.remove(j);
                    l = arr.size();
                    break;
                }
            }
            if (found) {
                res[i] = num;
            } else {
                res[i] = -1;
            }
        }
        return res;
    }
}