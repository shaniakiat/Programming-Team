import java.util.Scanner;
public class A469 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int i, temp;

    //initiate
    int[] a = new int[n + 1];
    for (i = 1; i <= n; i++) a[i] = 0;

    //Little X
    int p = scan.nextInt();
    for (i = 0; i < p; i++) {
      temp = scan.nextInt();
      a[temp] = 1;
    }

    //Little Y
    p = scan.nextInt();
    for (i = 0; i < p; i++) {
      temp = scan.nextInt();
      a[temp] = 1;
    }

    boolean pass = true;
    for (i = 1; i <= n; i++) {
      if (a[i] == 0) {
        pass = false;
        break;
      }
    }

    if (pass) System.out.print("I become the guy.");
      else System.out.print("Oh, my keyboard!");
  }
}
