import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class merge {
    public static void main(String[] args) {

        int[] nums1 = { -1, 0, 0, 3, 3, 3, 0, 0, 0 };
        int[] nums2 = { 1, 2, 2 };
        int m = 6;
        int n = 3;

        int count = 0;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0) {
                res.add(nums1[i]);
                count++;
            }
        }
        // System.out.println(res.toString());
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != 0) {
                res.add(nums2[i]);
                count++;
            }
        }
        System.out.println(count);
        if (count < nums1.length) {
            for (int i = count; i < nums1.length; i++) {
                res.add(0);
            }
        }
        Collections.sort(res);
        // System.out.println(res.toString());

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = res.get(i);
            // System.out.println(res.get(i));
        }

        // System.out.println(Arrays.toString(nums1));
    }
}