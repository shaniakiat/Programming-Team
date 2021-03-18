import java.util.Scanner;
public class shatteredcake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++ ){
            int w1 = sc.nextInt();
            int l1 = sc.nextInt();
            total += (w1 * l1);
        }

        int result = total / w;
        System.out.println(result);
        sc.close();
    }
}


// 4 width
// 7 shattered pieces
// 2 3 width and length 6
// 1 4 width and length 4
// 1 2 width and length 2
// 1 2 width and length 2
// 2 2 width and length 4
// 2 2 width and length 4
// 2 1 width and length 2
// 2+1+1+1+2+2+2 = 11 
// 3+4+2+2+2+2+1 = 16


// 4*6 = 24;