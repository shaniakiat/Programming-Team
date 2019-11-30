import java.util.Stack;

public class calPoints {
    public static void main(String[] args) {

        String[] ops = { "57", "D", "-3", "-58", "D", "77", "+", "C", "+", "+", "38", "78", "-6", "24", "-46", "+",
                "31", "20", "D", "-81" };
        Stack<String> s = new Stack<>();
        int sum = 0;
        int dub = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                int remove = Integer.parseInt(s.pop());
                sum -= remove;
            } else if (ops[i].equals("D")) {
                dub = Integer.parseInt(s.peek()) * 2;
                s.push("" + dub);
                sum += dub;
            } else if (ops[i].equals("+")) {
                int a = Integer.parseInt(s.pop());
                int b = Integer.parseInt(s.pop());
                sum += (a + b);
                s.push("" + a);
                s.push("" + (a + b));
            } else {
                s.push(ops[i]);
                sum += Integer.parseInt(ops[i]);
            }
        }
        System.out.println(sum);
    }
}