import java.util.Scanner;

public class A281{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char upperC = Character.toUpperCase(s.charAt(0));
        String newS = upperC + s.substring(1);
        System.out.println(newS);
    }
}