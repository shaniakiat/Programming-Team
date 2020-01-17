public class entryTime {
    public static void main(String[] args) {
        // String s = "423692";
        // String keypad = "923857614";

        String s = "91566165";
        String keypad = "639485712";

        int[][] pad = new int[3][3];
        int res = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pad[i][j] = Integer.parseInt(keypad.charAt(count) + "");
                // System.out.println(pad[i][j]);
                count++;
            }
        }
        int curX = 0;
        int curY = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (pad[i][j] == Integer.parseInt(s.charAt(0) + "")) {
                    curX = i;
                    curY = j;
                }
            }
        }

        int nextX = 0;
        int nextY = 0;

        for (int a = 1; a < s.length(); a++) {

            int diffX = 0;
            int diffY = 0;
            int diff = 0;
            // finding the position
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (pad[i][j] == Integer.parseInt(s.charAt(a) + "")) {
                        nextX = i;
                        nextY = j;
                    }
                }
            }
            diffX = Math.abs(nextX - curX);
            diffY = Math.abs(nextY - curY);
            diff = Math.max(diffX, diffY);

            curX = nextX;
            curY = nextY;

            res += diff;
        }
        System.out.println(res);
    }
}