import java.util.ArrayList;
import java.util.List;

public class LC728 {
    public static void main(String[] args) {
        int left = 1;
        int right = 33;
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        // looping from left to right
        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            // check if the number is a single digit
            int num = i;
            if (num >= 1 && num < 10) {
                list.add(num);
            } else {
                // keeping the actual number
                int actual_num = num;
                boolean acceptable = true;

                // getting each digit from the number
                while (num > 0) {
                    int temp_digit = num % 10;
                    if (actual_num % temp_digit == 0) {
                        num = num / 10;
                    } else {
                        acceptable = false;
                        break;
                    }
                }
                if (acceptable) {
                    list.add(actual_num);
                }
            }

        }

        return list;
    }
}
