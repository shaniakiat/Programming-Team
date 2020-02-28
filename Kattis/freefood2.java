import java.util.*;

import sun.launcher.resources.launcher;

public class freefood2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] days = new boolean[366];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            while (s <= e) {
                days[s] = true; // free food will be provided
                s++;

            }
        }
        int freeFood = 0;
        for (int i = 0; i <= 365; i++) {
            if (days[i]) {
                freeFood++;
            }
        }
        System.out.println(freeFood);
    }
}