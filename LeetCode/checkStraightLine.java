public class checkStraightLine {
    public static void main(String[] args) {
        // int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, {
        // 6, 7 } };
        // int[][] coordinates = { { 1, 1 }, { 2, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, {
        // 7, 7 } };

        int[][] coordinates = { { -4, -3 }, { 1, 0 }, { 3, -1 }, { 0, -1 }, { -5, 2 } };

        double m = 0;
        boolean line = true;

        if (coordinates.length <= 2) {
            line = true;
            System.out.println(line);
        } else {
            for (int i = 0; i < coordinates.length - 1; i++) {

                // since the all of inside array only has two elements
                // so instead of looping, i just called it manually with index 0 and 1

                int x1 = coordinates[i][0]; // getting the first x value; if i = 0 then [0][0]
                int x2 = coordinates[i + 1][0]; // getting the second x value; i = 1, [1][0]

                int y1 = coordinates[i][1]; // getting the first y value; i = 0 then [0][1]
                int y2 = coordinates[i + 1][1]; // getting the second y value i + 1 = 1 then [0][1]

                // System.out.println(x1 + ", " + y1);
                // System.out.println(x2 + ", " + y2);

                // the slope formula
                double currentM = ((double) y2 - (double) y1) / ((double) x2 - (double) x1);

                // if thats the first two points, then just add it to the m
                if (i == 0) {
                    m = currentM;
                }
                // based on the m, check if the next slope equal to the previous one
                // if not, the line is not straight
                // <3 you
                else if (i > 0 && currentM != m) {
                    line = false;
                    break;
                }

            }
            System.out.println(line);
        }
    }
}