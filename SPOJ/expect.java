import java.util.Scanner;
public class expect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 42){
            System.out.println(n);
            n = sc.nextInt();
        }
        if(n == 42){
            System.out.println(n);
        }
    }
}