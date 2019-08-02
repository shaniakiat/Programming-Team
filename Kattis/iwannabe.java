import java.util.Scanner;

public class iwannabe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] p = new int[N][3];
        int[]totalP = new int[N];

        for(int i = 0 ; i < N ; i++){
            for(int j = 0; j < 3; j++){
                p[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < )
        for(int i = 0 ; i < N ; i++){
            for(int j = 0; j < 3; j++){
                totalP[i] = totalP[i] + p[i][j];
            }
        }


    }
}