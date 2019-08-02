import java.util.Scanner;

public class thenextpalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            long k = sc.nextLong()+1;
            String kString = "" + k;
            int size = kString.length();
            boolean palin = false;

            // check if it's palin.
            for(int j = 0; j < size; j++){
                char a = kString.charAt(0);
                char b = kString.charAt((size-1)-0);

                if(a != b){
                    k = k+1;
                    kString = "" + k;
                    j = 0;
                } 

                if()

            }

        }
    }
}