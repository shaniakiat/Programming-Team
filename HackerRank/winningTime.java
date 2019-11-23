import java.util.*;

public class winningTime {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(5);
        a.add(2);
        a.add(3);
        System.out.println(getWinninTime(a, 3));
    }

    public static long getWinninTime(List<Integer> tickets, int p) {
        long startTime = System.currentTimeMillis(); // fetch starting time
        long time = -1;
        boolean done = true;
        while (done && (System.currentTimeMillis() - startTime) < 900) {
            int first = tickets.get(0);
            // System.out.println(first);
            tickets.remove(0);
            int reduce = first - 1;
            if (reduce > 0) {
                tickets.add(reduce);
            }
            if (reduce == 0) {
                // System.out.println("size: " + tickets.size());
            }
            // System.out.println("first: " + first);
            // System.out.println("position: " + time + " reduce: " + reduce);
            // System.out.println(tickets.size());

            // System.out.println("p: " + p);
            if (p == 0 && first == 1) {
                done = false;
            }
            if (p == 0 && first != 0) {
                p = tickets.size();
            }

            time++;
            p--;
            // System.out.println("time: " + time);
            // System.out.println();
        }
        return time + 1;
    }
}