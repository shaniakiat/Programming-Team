import java.util.Scanner;

public class D761 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int l = scan.nextInt();
    int r = scan.nextInt();

    int i;
    int[] a = new int[n];
    int[] p = new int[n];

    for (i = 0; i < n; i++)
      a[i] = scan.nextInt();
    for (i = 0; i < n; i++)
      p[i] = scan.nextInt();

    scan.close();

    int[] b = new int[n];
    for (i = 0; i < n; i++)
      b[i] = a[i] + p[i];

    int max = l - 1;
    int min = r + 1;

    for (i = 0; i < n; i++) {
      if (max < b[i])
        max = b[i];
      if (min > b[i])
        min = b[i];
    }

    if ((max - min) > (r - l)) {
      System.out.println(-1);
      return;
    }

    int minus = max - r;
    for (i = 0; i < n; i++) {
      System.out.print((b[i] - minus) + " ");
    }
  }
}
