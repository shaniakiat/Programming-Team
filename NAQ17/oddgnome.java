import java.util.Scanner;
public class oddgnome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		short n = scan.nextShort();
		short i, j, g;
		short[] a = new short[1000];
		for (i = 0; i < n; i++) {
			g = scan.nextShort();
			for (j = 0; j < g; j++) {
				a[j] = scan.nextShort();
			}
			scan.nextLine();
			for (j = 1; j < g - 1; j++) {
				if ((a[j] - a[j - 1] != 1)) {
					System.out.println((j + 1));
					break;
				}
			}
		}
	}
}
