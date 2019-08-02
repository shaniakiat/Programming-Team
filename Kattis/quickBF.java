import java.util.Scanner;

public class quickBF{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++);
        String s = sc.nextLine();

        int cnt = 0;
        String missing = 0;
        for(char c = 'a'; c <= 'z'; c++){
            for(int ind = 0; ind < s.length(); ind++){
                if(s.charAt(ind) == c){
                    cnt += 1;
                } else{
                    
                }
            }
        }
        if(cnt >= 26){
            System.out.println("pangram");
        } if else{

        }
    }
}