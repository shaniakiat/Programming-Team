import java.util.Scanner;

public class numJewelsInStones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String J = sc.nextLine();
        String S = sc.nextLine();

        int cnt = 0;
        for(int i = 0; i < J.length(); i++){
            for(int j = 0; j < S.length(); j++){
                if(J.charAt(i) == S.charAt(j)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}