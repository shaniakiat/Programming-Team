import java.util.Scanner;
public class A189 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    

    int[] op = new int[n + 1];
    op[0] = 1;
    for (int i = 1; i <= n; i++) {
      op[i] = 0;
      if ((i >= a) && (op[i - a] > 0)) op[i] = Math.max(op[i], op[i - a] + 1);
      if ((i >= b) && (op[i - b] > 0)) op[i] = Math.max(op[i], op[i - b] + 1);
      if ((i >= c) && (op[i - c] > 0)) op[i] = Math.max(op[i], op[i - c] + 1);
    }

    System.out.println(op[n] - 1);
    scanner.close();
  }
}
