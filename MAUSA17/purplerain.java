import java.util.Scanner;
public class purplerain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int i, n;
		n = input.length();
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			if (input.charAt(i) == 'B') {a[i] = 1;}
			else {a[i] = -1;}
		}

		int[] B = new int[n];
		int[] sB = new int[n];
		int[] R = new int[n];
		int[] sR = new int[n];

		//Considering Blue:
		B[0] = a[0];
		sB[0] = 0;
		for (i = 1; i < n; i++) {
			if (a[i] + B[i - 1] >= a[i]) {
				B[i] = a[i] + B[i - 1];
				sB[i] = sB[i - 1];
			}
			else {
				B[i] = a[i];
				sB[i] = i;
			}
		}

		//Consider Red:
		R[0] = a[0];
		sR[0] = 0;
		for (i = 1; i < n; i++) {
			if (a[i] + R[i - 1] <= a[i]) {
				R[i] = a[i] + R[i - 1];
				sR[i] = sR[i - 1];
			}
			else {
				R[i] = a[i];
				sR[i] = i;
			}
		}

		int maxDifference = 0;
		int st = 0, en = 0;

		//Determining output
		for (i = 0; i < n; i++) {
			//Taking the most left, so only < instead of <=
			if (maxDifference < Math.abs(B[i])) {
				maxDifference = Math.abs(B[i]);
				st = sB[i];
				en = i;
			}
			if (maxDifference < Math.abs(R[i])) {
				maxDifference = Math.abs(R[i]);
				st = sR[i];
				en = i;
			}
		}

		System.out.print((st + 1) + " " + (en + 1));
	}
}
