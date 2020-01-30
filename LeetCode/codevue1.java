import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class codevue1 {
    public static void main(String[] args) {
        int num = 22;
        // using hashset to keep track the sum that we have seen previously
        HashSet<Integer> haveSeen = new HashSet<Integer>();
        // to keep track if we found a number in the hashset
        boolean contains = false;
        while (num != 1) {
            int curr = num;
            int total = 0;
            while (curr != 0) {
                total += (curr % 10) * (curr % 10);
                curr /= 10;
            }
            if (haveSeen.contains(total)) {
                System.out.println(0);
                contains = true;
                break;
            }
            haveSeen.add(total);
            num = total;
        }
        if (contains == false) {
            System.out.println(1);
        }
    }
}