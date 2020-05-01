import java.util.ArrayList;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = { 3, 9, 9 };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < digits.length; i++) {
            list.add(digits[i]);
        }

        // 0, 6, 7, 8, 9

        for (int i = list.size() - 1; i >= 1; i--) {
            if (i == list.size() - 1) {
                int temp = list.get(i) + 1;
                list.remove(i);
                list.add(i, temp);
                System.out.println("temp: " + temp);
            }
            if (list.get(i) == 10) {
                int current = 0;
                list.remove(i);
                list.add(i, current);
                System.out.println(list.get(i));
                System.out.println("current: " + current);

                int oneBefore = list.get(i - 1) + 1;
                list.remove(i - 1);
                list.add(i - 1, oneBefore);
                System.out.println(list.get(i - 1));
                System.out.println("oneBefore: " + oneBefore);

            }
        }
        System.out.println(list.toString());
        // check if the first index is zero
        int[] res;
        if (list.get(0) == 0) {
            res = new int[digits.length];
            list.remove(0);
            for (int i = 0; i < res.length; i++) {
                res[i] = list.get(i);
                System.out.println(list.get(i));
            }
        } else {
            res = new int[list.size()];
            for (int i = 0; i < res.length; i++) {
                res[i] = list.get(i);
                System.out.println(list.get(i));
            }
        }

        // return res;

    }
}