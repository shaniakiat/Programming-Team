public class minTimeToVisitAllPoints {
    public static void main(String[] args) {
        int[][] points = { { 3, 2 }, { -2, 2 } };

        int seconds = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int[] pointOne = points[i];
            int[] pointTwo = points[i + 1];

            int x1 = pointOne[0];
            int x2 = pointTwo[0];

            int y1 = pointOne[1];
            int y2 = pointTwo[1];

            int x = 0;
            int y = 0;
            if (x1 > x2) {
                x = x1 - x2;
            } else {
                x = x2 - x1;
            }

            if (y1 > y2) {
                y = y1 - y2;
            } else {
                y = y2 - y1;
            }

            if (x > y) {
                seconds += x;
            } else {
                seconds += y;
            }
        }
        System.out.println(seconds);
    }
}