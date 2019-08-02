import java.util.Scanner;

public class zamka{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int n = smallest(l, d, x);
        int m = largest(l, d, x);

        System.out.println(n);
        System.out.println(m);

        // find the smallest number between l and d that the sum of their digits will equals to x
        // find the largest number between l and d that the sum of their digits will equals to x

    }
    public static int smallest(int L, int D, int X){
        int sum = 0;
        // if we haven't found the smallest sum of the digits, keep looping.
        while(sum != X && L < D){
            sum = 0;
            int keepL = L;
            while(L > 0){
                sum += L % 10;
                L = L / 10;
            }
            L = keepL + 1;
        }
        return L-1;
    }

    public static int largest(int L, int D, int X){
        int sum = 0;

        while(sum != X && D > L){
            sum = 0;
            int keepD = D;
            while(D > 0){
                sum += D % 10;
                D = D / 10;
            }
            D = keepD - 1;
        }
        return D+1;
    }
}
