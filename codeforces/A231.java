import java.util.Scanner;

public class A231{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bf = new int[3];
        int cnt = 0;
        int cntTotal = 0;

        for(int i = 0; i < n; i++){
            for(int a = 0; a < 3; a++){
                bf[a] = sc.nextInt();
                cnt += bf[a];
            }
            if(cnt >= 2){
                cntTotal++;
                cnt = 0;
            }
        }
        System.out.println(cntTotal);
    }
}