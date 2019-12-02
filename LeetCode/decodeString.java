import java.util.Stack;

public class decodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        String res = "";
        int countOpenBrackets = 0;
        Stack<String> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                countOpenBrackets++;
            }
            if (s.charAt(i) == ']') {
                String temp = "";
                while (!stack.peek().equals("[")) {
                    temp += stack.pop();
                }
                System.out.println(temp);
                stack.pop(); // remove "["
                countOpenBrackets--;
                int n = Integer.parseInt(stack.pop());

                if (countOpenBrackets == 0) {
                    for (int j = 0; j < n; j++) {
                        res += temp;
                    }
                } else {
                    String anotherTemp = "";
                    for (int j = 0; j < n; j++) {
                        anotherTemp += temp;
                    }
                    stack.push(anotherTemp);
                }
            } else {
                System.out.println(s.charAt(i));
                stack.push("" + s.charAt(i));
            }
        }
        System.out.println(res);
    }
}