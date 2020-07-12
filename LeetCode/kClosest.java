import java.util.PriorityQueue;

public class kClosest {
    public static void main(String[] args) {
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 1;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> (b[0] * b[0] + b[1] * b[1] - (a[0] * a[0] + a[1] * a[1])));

        for (int[] point : points) {
            maxHeap.add(point);
            if (maxHeap.size() > k) {
                int[] n = maxHeap.remove();
                System.out.println(n[0] + ", " + n[1]);
            }
        }
        int[][] result = new int[k][2];
        k--;
        while (k >= 0) {
            result[k] = maxHeap.remove();
            System.out.println("RES: " + result[k][0] + ", " + result[k][1]);
            k--;
        }
    }
}