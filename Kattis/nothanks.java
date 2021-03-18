import java.util.Arrays;
import java.util.Scanner;

public class nothanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int total = 0;

        Arrays.sort(arr);

        int prev = arr[0];
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            if(i == 0){
                total = total + current;
            } 
            else if(current-1 != prev){
                total = total + current;
            }
            prev = current;
        }
        System.out.println(total);
        sc.close();
    }
}
