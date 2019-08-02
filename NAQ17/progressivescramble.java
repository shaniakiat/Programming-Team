import java.util.Scanner;

public class progressivescramble {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int i, j, m, temp;
		String input, s;
		int[] a = new int[80];
		for (i = 0; i < n; i++) {
			input = scan.nextLine();
			s = input.substring(2);
			m = (int) s.length();

			for (j = 0; j < m; j++) {
				if (s.charAt(j) == ' ') {
					a[j] = 0;
				} else {
					a[j] = ((int) s.charAt(j)) - 96;
				}
			}
			/*-------------------------Encrypt---------------------------*/
			if (input.charAt(0) == 'e') {
				for (j = 1; j < m; j++) {
					a[j] = (a[j] + a[j - 1]) % 27;
				}
			} else {
				for (j = m - 1; j > 0; j--) {
					temp = a[j] - a[j - 1];
					while (temp < 0) {
						temp += 27;
					}
					temp = temp % 27;
					a[j] = temp;
				}
			}
			/*-------------------------Decrypt---------------------------*/
			for (j = 0; j < m; j++) {
				if (a[j] == 0) {
					System.out.print(" ");
				} else {
					System.out.print(((char) (a[j] + 96)));
				}
			}
			System.out.println();
		}
	}
}
