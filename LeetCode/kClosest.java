import java.util.PriorityQueue;

public class kClosest {
    public static void main(String[] args) {
        int[][] points = { { 1, 2 }, { -2, 2 } };
        int k = 1;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> (b[0] * b[0] + b[1] * b[1] - (a[0] * a[0] + a[1] * a[1])));

        for (int[] point : points) {
            maxHeap.add(point);
            if (maxHeap.size() > k) {
                maxHeap.remove();
            }
        }
        int[][] result = new int[k][2];
        while (k-- > 0) {
            result[k] = maxHeap.remove();
        }
    }
}