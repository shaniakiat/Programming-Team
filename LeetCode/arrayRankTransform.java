public class arrayRankTransform {
    public static void main(String[] args) {

    }

    public int[] arrayRankTransformFunction(int[] arr) {
        int[] arrSorted = arr.clone();
        Arrays.sort(arrSorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int prev = 0;
        int rank = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                map.put(arrSorted[i], rank);
                prev = arrSorted[i];
                rank++;
            } else if (arrSorted[i] == prev) {
                rank--;
                map.put(arrSorted[i], rank);
                prev = arrSorted[i];
                rank++;
            } else {
                map.put(arrSorted[i], rank);
                prev = arrSorted[i];
                rank++;
            }
        }

        // System.out.println(map.toString());
        for (int i = 0; i < arr.length; i++) {
            int val = map.get(arr[i]);
            arr[i] = val;
            // System.out.println(val);
        }
        return arr;
    }
}
