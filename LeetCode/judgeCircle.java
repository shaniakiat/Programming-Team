public class judgeCircle {
    public static void main(String[] args) {
        int pUD = 0; // origin
        int pRL = 0;
        String moves = "RRDD";
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                pUD++;
            } else if (moves.charAt(i) == 'D') {
                pUD--;
            } else if (moves.charAt(i) == 'R') {
                pRL++;
            } else if (moves.charAt(i) == 'L') {
                pRL--;
            }
        }
        if (pUD == 0 && pRL == 0) {
            System.out.println("true");
        } else {

            System.out.println("false");
        }

    }
}