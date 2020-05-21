import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class intersect {
    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        if (nums1.length < nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                if (list2.contains(nums1[i])) {
                    result.add(nums1[i]);
                    list2.remove(Integer.valueOf(nums1[i]));
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                if (list1.contains(nums2[i])) {
                    result.add(nums2[i]);
                    list1.remove(Integer.valueOf(nums2[i]));
                }
            }
        }
        // System.out.println(result);
        int[] toReturn = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            toReturn[i] = result.get(i);
        }
        // return toReturn;
    }
}