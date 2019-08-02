import java.util.*;

public class B1077{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            // System.out.println(a[i]);
        }

        for(int i = 0; i <= n-3; i++){
            int x = a[i];
            int y = a[i+1];
            int z = a[i+2];

            if(x == 1 && y == 0 && z == 1){
                a[i] = 0;
                a[i+1] = 0;
                a[i+2] = 0;
                k++;

            //     for(int j = 0; j < n; j++){
            //         // a[i] = sc.nextInt();
            //         System.out.print(a[j]);
            //     }
            //     System.out.println();
            }
        }
        System.out.print(k);
    }
}