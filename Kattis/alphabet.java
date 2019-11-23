import java.util.ArrayList;
import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String input = sc.nextLine();
        boolean found = false;
        int count = 0;
        for (int i = 0; i < alpha.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (alpha.charAt(i) == input.charAt(j) && found == false) {
                    System.out.print(alpha.charAt(i));
                    found = true;
                    count = count + 1;
                }
                if (found && i != 0) {
                    input = input.substring(j);
                    found = false;
                }
            }
        }
        System.out.println(count);
    }
}