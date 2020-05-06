import java.util.ArrayList;
import java.util.HashMap;

import javax.security.auth.kerberos.KerberosKey;

public class partitionArray2 {
    public static void main(String[] args) {
        int k = 3;
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> arrayOfResults = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);

        for (int i = 0; i < numbers.size() - 1; i++) {
            numbers.remove(Integer.valueOf(0));
        }

        for (int i = 0; i <= numbers.size() - k; i++) {
            boolean dups = false;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < k + i; j++) {
                int curr = numbers.get(j);
                map.put(curr, map.getOrDefault(curr, 0) + 1);
            }
            // System.out.println(map.toString());

            for (int n : map.keySet()) {
                int v = map.get(n);
                if (v > 1) {
                    dups = true;
                    break;
                }
            }
            if (dups) {
                arrayOfResults.add(0);
            } else {
                arrayOfResults.add(1);
            }
        }
        if (arrayOfResults.contains(1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}