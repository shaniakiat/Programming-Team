import java.util.ArrayList;

public class fizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        ArrayList<String> l = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                l.add("FizzBuzz");
            else if (i % 3 == 0)
                l.add("Fizz");
            else if (i % 5 == 0)
                l.add("Buzz");
            else
                l.add("" + i);
        }

        System.out.println(l.toString());
    }
}