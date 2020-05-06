import java.util.ArrayList;
import java.util.Collections;

public class segment {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> listOfSegment = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();

        // arr.add(2);
        // arr.add(5);
        // arr.add(4);
        // arr.add(6);
        // arr.add(8);
        // int x = 3;
        arr.add(3);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        int x = 2;

        for (int i = 0; i < arr.size() - 2; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            
            Collections.sort(temp);
            // for (int j = i; j < x + 1; j++) {
            // temp.add(arr.get(i));
            // }
            min.add(temp.get(0));
            listOfSegment.add(temp);
        }
        Collections.sort(min);
        System.out.println(min.get(min.size() - 1));
    }

}