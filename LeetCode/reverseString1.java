public class reverseString1 {
    public static void main(String[] args) {
        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };

        int b = 0;
        for (int e = s.length - 1; e >= s.length / 2; e--) {
            char beginning = s[b];
            char end = s[e];
            s[e] = beginning;
            s[b] = end;
            b++;
        }

        // for (char c : s) {
        // System.out.print(c + " ");
        // }
    }
}