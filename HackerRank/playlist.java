import java.util.Scanner;

class playlist {
    public static void main(String[] args) {
        int n = 4;
        String[] songs = { "hi", "ha", "he", "he" };
        int k = 0;
        String q = "he";

        int up = 0;
        int down = 0;

        // going up = ha
        for (int i = k; i <= n; i++) {
            up++;
            if (i == songs.length) {
                i = 0;
                n = k;
            }
            if (songs[i].equals(q)) {
                break;
            }

        }

        // going down
        for (int i = k; i >= 0; i--) {
            down++;
            if (i == 0) {
                i = n - 1;
                n = k;
            }

            if (songs[i].equals(q)) {
                break;
            }
        }

        if (down < up) {
            System.out.println(down);
        } else {
            System.out.println(up);
        }

    }

}