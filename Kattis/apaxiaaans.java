import java.util.Scanner;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newS = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                newS += s.charAt(i);
            }
        }
        System.out.println(newS);
    }
}