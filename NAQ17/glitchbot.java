import java.util.Scanner;
public class glitchbot {
	public static int[] a = new int[50];
	public static int cur_x, cur_y;

	public static void go(int n) {
		int mul_x = 0, mul_y = 1;
		cur_x = 0; cur_y = 0;
		int i;

		for (i = 0; i < n; i++) {
			if (a[i] == 1) {
				cur_x += mul_x;
				cur_y += mul_y;
			}
			else if (a[i] == 2) {
				//turn right
				if ((mul_x == 0) && (mul_y == 1)) {// up
					mul_x = 1;
					mul_y = 0;
				}
				else if ((mul_x == 0) && (mul_y == -1)) {// down
					mul_x = -1;
					mul_y = 0;
				}
				else if ((mul_x == 1) && (mul_y == 0)) {// right
					mul_x = 0;
					mul_y = -1;
				}
				else if ((mul_x == -1) && (mul_y == 0)) {// left
					mul_x = 0;
					mul_y = 1;
				}
			}
			else {
				//turn left
				if ((mul_x == 0) && (mul_y == 1)) {// up
					mul_x = -1;
					mul_y = 0;
				}
				else if ((mul_x == 0) && (mul_y == -1)) {// down
					mul_x = 1;
					mul_y = 0;
				}
				else if ((mul_x == 1) && (mul_y == 0)) {// right
					mul_x = 0;
					mul_y = 1;
				}
				else if ((mul_x == -1) && (mul_y == 0)) {// left
					mul_x = 0;
					mul_y = -1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.nextLine();
		int n = scan.nextInt();
		scan.nextLine();

		int i, j, save;
		String s;
		for (i = 0; i < n; i++) {
			s = scan.nextLine();
			if (s.equals("Forward")) a[i] = 1;
				else if (s.equals("Right")) a[i] = 2;
					else a[i] = 3;
		}

		for (i = 0; i < n; i++) {
			save = a[i];
			for (j = 1; j <= 3; j++) {
				if (j != save) {
					a[i] = j;
					go(n);
					if ((cur_x == x) && (cur_y == y)) {
						if (j == 1) System.out.println((i + 1) + " Forward");
							else if (j == 2) System.out.println((i + 1) + " Right");
								else System.out.println((i + 1) + " Left");
						return;
					}
					a[i] = save;
					scanner.close();
				}
			}
		}
	}
}
