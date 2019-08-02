import java.util.Scanner;
import java.io.*;

public class fill {
	public static int n, m;
	public static char[][] matrix = new char[500][500];

	public static void fill(int i, int j, char o, char c) {
		//o: Original character
		//c: Character to be replaced with

		//Replace the character
		matrix[i][j] = c;

		int new_i, new_j;

		//Up
		new_i = i - 1;
		new_j = j;
		if (((new_i >= 0) && (new_i < n)) && ((new_j >= 0) && (new_j < m))) {
			if (matrix[new_i][new_j] == o) {
				fill(new_i, new_j, o, c);
			}
		}

		//Down
		new_i = i + 1;
		new_j = j;
		if (((new_i >= 0) && (new_i < n)) && ((new_j >= 0) && (new_j < m))) {
			if (matrix[new_i][new_j] == o) {
				fill(new_i, new_j, o, c);
			}
		}

		//Left
		new_i = i;
		new_j = j - 1;
		if (((new_i >= 0) && (new_i < n)) && ((new_j >= 0) && (new_j < m))) {
			if (matrix[new_i][new_j] == o) {
				fill(new_i, new_j, o, c);
			}
		}

		//Right
		new_i = i;
		new_j = j + 1;
		if (((new_i >= 0) && (new_i < n)) && ((new_j >= 0) && (new_j < m))) {
			if (matrix[new_i][new_j] == o) {
				fill(new_i, new_j, o, c);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("in.txt"));

		n = scan.nextInt();
		m = scan.nextInt();

		scan.nextLine();

		String s = scan.nextLine();
		String[] input = s.split(" ");

		int row = Integer.parseInt(input[0]);
		int col = Integer.parseInt(input[1]);
		char c = input[2].charAt(0);

		int i, j;
		for (i = 0; i < n; i++) {
			s = scan.nextLine();
			for (j = 0; j < m; j++) {
				matrix[i][j] = s.charAt(j);
			}
		}

		row--; col--;
		fill(row, col, matrix[row][col], c);

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
