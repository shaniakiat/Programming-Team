import java.util.*;

public class dominatingduos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int valid = 0;
         

        for(int i = 0; i < n; i++){
            int prev = arr[i];
            for(int j = i + 1; j < n; j++){
                int right = arr[j];
                if(j-i == 1){
                    valid++;
                    prev = arr[j];
                } else if(prev < right){
                    valid++;
                    prev = arr[j];
                } else {
                    j = n;
                }
                
            }
           
        }
        System.out.println(valid);


    }

}
