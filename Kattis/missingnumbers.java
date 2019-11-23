import java.util.Scanner;

public class missingnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        // reading the input from Scanner
        for (int j = 0; j < n; j++) {
            input[j] = sc.nextInt();
        }
        // getting the last number and
        // create a new array based on the last number form the input
        int last = input[n - 1];
        int[] newNum = new int[last + 1];

        // if the number from the input array equal to the index for the newNum array,
        // add that number to the current index
        // index = value
        for (int i = 0; i < n; i++) {
            int temp = input[i];
            newNum[temp] = temp;
        }

        int count = 0;
        for (int i = 1; i <= last; i++) {
            if (newNum[i] == 0) {
                System.out.println(i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("good job");
        }
        sc.close();
    }
}