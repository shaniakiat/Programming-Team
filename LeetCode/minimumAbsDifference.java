public class minimumAbsDifference {
    public static void main(String[] args) {

    }

    public List<List<Integer>> minimumAbsDifferenceFunction(int[] arr) {
        Arrays.sort(arr);
        int minDistance = Integer.MAX_VALUE;
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int distance = Math.abs(b - a);
            if (distance < minDistance) {
                pairs.clear();
                minDistance = distance;
                List<Integer> onePair = new ArrayList<>();
                onePair.add(a);
                onePair.add(b);
                pairs.add(onePair);
            } else if (distance == minDistance) {
                minDistance = distance;
                List<Integer> onePair = new ArrayList<>();
                onePair.add(a);
                onePair.add(b);
                pairs.add(onePair);
            }
        }
        return pairs;
    }
}
