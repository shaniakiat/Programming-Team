import java.util.ArrayList;

public class numTeams {
    public static void main(String[] args) {
        int[] rating = { 1, 2, 3, 4 };
        int res = 0;
        int pointer = 0;
        for (int i = 0; i < rating.length - 1;) {
            ArrayList<Integer> tempL = new ArrayList<>();
            tempL.add(rating[i]);
            int withPointer = i + 1 + pointer;
            if (withPointer < rating.length) {
                tempL.add(rating[withPointer]);
                for (int j = withPointer; j < rating.length - 1; j++) {
                    tempL.add(rating[j + 1]);
                    System.out.println(tempL);
                    if (checkSorted(tempL)) {
                        res++;
                    }
                    tempL.remove(tempL.size() - 1);
                }
                pointer++;
            } else {
                i++;
                pointer = 0;
            }
            tempL.removeAll(tempL);
        }

        System.out.println(res);
    }

    public static boolean checkSorted(ArrayList<Integer> list) {
        boolean ascending = ascendingOrder(list);
        boolean desending = descendingOrder(list);
        if (!ascending && !desending) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean ascendingOrder(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!(list.get(i) < list.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean descendingOrder(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!(list.get(i) > list.get(i + 1))) {
                return false;
            }
        }
        return true;
    }
}
