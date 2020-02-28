import java.util.Scanner;

class freefood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] events = new boolean[366];
        int n = sc.nextInt();
        int freeFood = 0;

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            while (start <= end) {
                events[start] = true;
                start++;
            }
        }

        for (int i = 0; i <= 365; i++) {
            if (events[i]) {
                freeFood++;
            }
        }

        System.out.println(freeFood);
    }
}