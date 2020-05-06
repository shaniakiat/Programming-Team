import java.util.ArrayList;

public class partitioningArray {
    public static void main(String[] args) {
        int k = 3;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        // numbers.add(0);
        // numbers.add(2);
        // numbers.add(0);
        // numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        // ArrayList<Integer> newNumbers = new ArrayList<>();

        // // remove 0 and duplicates

        for (int i = 0; i < numbers.size() - 1; i++) {
            numbers.remove(Integer.valueOf(0));

        }

        String result = "Yes";

        for (int i = 0; i <= numbers.size() - k; i++) {
            ArrayList<Integer> partition = new ArrayList<>();

            for (int j = i; j < k + i; j++) {
                if (!partition.contains(numbers.get(j))) {
                    partition.add(numbers.get(j));
                }
            }
            // System.out.println(partition);
            if (partition.size() != k) {
                result = "No";
                break;
            }
        }
        // System.out.println(numbers.toString());
        System.out.println(result);
    }

}