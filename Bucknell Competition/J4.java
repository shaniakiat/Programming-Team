import java.util.Scanner;

public class J4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String firstNum = s.substring(0,s.length()-1);
        String target = sc.next();
        int digit = target.length();

        int aNum = 0;

        for(int i = 0; i < firstNum.length-2; i++){
            aNum = firstNum.substring(i,i+digit);
            System.out.println(aNum);
        }
    }
}