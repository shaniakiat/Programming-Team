public class isPossible {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 5;
        int d = 2;

        LinkedList<Pair<Integer, Integer>> points = new LinkedList<Pair<Integer, Integer>>();
        points.addLast(new Pair<Integer, Integer>(a, b));
        while (!points.isEmpty()) {
            Pair<Integer, Integer> pair = points.poll();
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if (key.equals(a) && value.equals(b)) {
                return "YES";
            }
            int sum = key + value;
            if (sum <= c) {
                points.addLast(new Pair<Integer, Integer>(sum, value));
            }
            if (sum <= d) {
                points.addLast(new Pair<Integer, Integer>(key, sum));
            }

        }

        return "NO";

    }
}