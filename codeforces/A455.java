import java.util.Scanner;
public class A455 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int i;
    int[] h = new int[100001];
    long[] op = new long[100001];

    for (i = 0; i <= 100000; i++) {
      h[i] = 0;
      op[i] = 0;
    }

    int temp;
    for (i = 0; i < n; i++) {
      temp = scan.nextInt();
      h[temp]++;
    }

    op[0] = 0; op[1] = h[1];
    for (i = 2; i <= 100000; i++) {
      op[i] = Math.max((long) i * (long) h[i] + op[i - 2], op[i - 1]);
    }

    System.out.println(op[100000]);
  }
}
