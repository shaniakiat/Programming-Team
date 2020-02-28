import java.util.*;

public class icpcawards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, String> map = new HashMap<>();
        int c = 0;

        for (int i = 0; i < n; i++) {
            String u = sc.next();
            String t = sc.next();

            if (!map.containsKey(u) && c < 12) {
                c++;
                System.out.println(u + " " + t);
                map.put(u, t);
            }
        }
        // System.out.println(map.size());
    }
}