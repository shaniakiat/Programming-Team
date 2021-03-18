import java.util.Scanner;

public class thisaintyourgrandpascheckerboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[][] board = new String[n][n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();

            for (int j = 0; j < n; j++) {
                board[i][j] = s.charAt(j) + "";
                // System.out.print(board[i][j]);
            }
            // System.out.println();
        }

        boolean equal = true; // we assume its equal

        for(int i = 0; i < n; i++){
            int countWhiteRow = 0;
            int countBlackRow = 0;
            for(int j = 0; j < n; j++){
               
                if(board[i][j].equals("W")){
                    countWhiteRow += 1;
                }
                if(board[i][j].equals("B")) {
                    countBlackRow += 1;
                }
            }
            if(countWhiteRow != countBlackRow){
                equal = false;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            int countWhiteColumn = 0;
            int countBlackColumn = 0;

            int consecutive = 0;
            for (int i = 0; i < n; i++) {

                if (board[i][j].equals("W")) {
                    countWhiteColumn += 1;
                }
                if (board[i][j].   
                ghequals("B")) {
                    countBlackColumn += 1;
                }

            }
            if (countWhiteColumn != countBlackColumn) {
                equal = false;
                break;
            }
        }

        if(equal){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
        sc.close();
    }
}

// 4 WBBW WBWB BWWB BWBW
