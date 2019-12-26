import java.util.ArrayList;
import java.util.HashMap;

class uniqueOccurrences {
    public static void main(String[] args){
        int[] arr = {1,2,2,1,1,3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        boolean res = true;
        ArrayList<Integer> arrL = new ArrayList<>();
        int i = 0;
        while(i)
    }
}