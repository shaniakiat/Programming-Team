import java.util.Scanner;

public class A490 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] t = new int[n];
    int i;
    for (i = 0; i < n; i++)
      t[i] = scan.nextInt();

    int[] one = new int[n];
    int[] two = new int[n];
    int[] thr = new int[n];

    int onec = 0, twoc = 0, thrc = 0;

    for (i = 0; i < n; i++) {
      if (t[i] == 1) {
        one[onec] = i + 1;
        onec++;
      }
      else if (t[i] == 2) {
        two[twoc] = i + 1;
        twoc++;
      }
      else {
        thr[thrc] = i + 1;
        thrc++;
      }
    }

    System.out.println(Math.min(onec, Math.min(twoc, thrc)));

    for (i = 0; i < Math.min(onec, Math.min(twoc, thrc)); i++) {
      System.out.println(one[i] + " " + two[i] + " " + thr[i]);
    }

    scan.close();
  }
}
