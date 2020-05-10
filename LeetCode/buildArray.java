import java.util.ArrayList;

public class buildArray {
    public static void main(String[] args) {
        int[] target = { 1, 4 };
        int n = 4;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < target.length; i++) {
            list.add(target[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (!list.contains(i)) {
                res.add("Push");
                res.add("Pop");
            } else {
                res.add("Push");
            }
        }
        int length = res.size() - 1;
        for (int i = length; i >= 0; i--) {
            System.out.println(res.get(i));
            if (res.get(i).equals("Pop")) {
                res.remove(i);
                res.remove(i - 1);
                i--;
            } else if (res.get(i).equals("Push")) {
                break;
            }
        }

        System.out.println(res.toString());
    }
}