import java.util.*;

public class icpcawards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        int n = sc.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            String u = sc.next(); // institutions
            String t = sc.next(); // teams
            // System.out.println(u + ": " + t);
            if (!map.containsKey(u) && max < 12) {
                map.put(u, t);
                System.out.println(u + " " + t);
                max++;
            }
        }
    }
}