import java.util.*;

public class FreelancingPlatform {
    public static void main(String[] args) {
        ArrayList<Integer> id = new ArrayList<>();
        id.add(0);
        id.add(1);
        id.add(0);
        id.add(1);
        id.add(1);
        ArrayList<Integer> bids = new ArrayList<>();
        bids.add(4);
        bids.add(74);
        bids.add(47);
        bids.add(744);
        bids.add(7);
        System.out.println(minCost(2, id, bids));

    }

    public static long minCost(int numProjects, ArrayList<Integer> projectId, ArrayList<Integer> bid) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < projectId.size(); i++) {
            if (map.containsKey(projectId.get(i))) {
                ArrayList<Integer> list = map.get(projectId.get(i));
                list.add(bid.get(i));
                map.put(projectId.get(i), list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(bid.get(i));
                map.put(projectId.get(i), list);
            }
        }

        long totalMin = 0;
        for (int n : map.keySet()) {
            ArrayList<Integer> list = map.get(n);
            int currMin = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                currMin = Math.min(currMin, list.get(i));
            }
            totalMin += currMin;
        }

        if (map.size() != numProjects) {
            return -1;
        } else {
            return totalMin;
        }
    }
}
