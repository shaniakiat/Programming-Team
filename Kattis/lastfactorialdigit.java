import java.util.Scanner;

public class lastfactorialdigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int f = sc.nextInt();
            int factorial = 1;
            if(f == 0 || f == 1){
                System.out.println(factorial);
            } else {
                for(int j = 2; j <= f; j++){
                    factorial *= j;
                }
                System.out.println(factorial%10);
            }

        }
    }
}