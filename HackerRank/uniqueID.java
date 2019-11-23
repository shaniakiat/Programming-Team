import java.util.*;

public class uniqueID {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(3);
        // a.add(5);
        // a.add(5);
        // a.add(7);
        System.out.println(getUniqueID(a));
    }

    public static int getUniqueID(List<Integer> arr) {
        Collections.sort(arr);
        int res = 0;
        int newElement = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) == arr.get(i)) {
                newElement = arr.get(i) + 1;
                arr.set(i, newElement);
            } else if (arr.get(i - 1) > arr.get(i)) {
                newElement = arr.get(i - 1) + 1;
                arr.set(i, newElement);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            res += arr.get(i);
        }
        return res;
    }
}