import java.util.Scanner;

public class deathknight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean CD = false;
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            for (int j = 0; j < word.length() - 1; j++) {
                if (word.charAt(j) == 'C' && word.charAt(j + 1) == 'D') {
                    // System.out.println("test");
                    CD = true;
                    j = word.length();
                }
            }
            if (!CD) {
                count = count + 1;
            }
            CD = false;
            sc.nextLine();
        }
        System.out.println(count);

    }
}