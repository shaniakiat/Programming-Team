import java.util.HashMap;
import java.util.Scanner;

public class unreadmessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i+1, false); // we assume all the members havent read the msgs
        }

        for(int i = 0; i < m; i++){
            int memberSentAMsg = sc.nextInt();
            
        }
        sc.close();

    }
}
