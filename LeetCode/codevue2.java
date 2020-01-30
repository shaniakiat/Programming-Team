import java.util.*;

public class codevue2 {
    public static void main(String[] args) {
        // valid parenthesis. to determine if the characters containing curly braket,
        // hard brackets, and paranthesis that are well formed.
        // the problem is definene as given a string contains of these paranthesis, the
        // goal find a matching parenthesis, which is there is an open and close
        // paranthesis, and it's in the right order.

        // we are gonna use stack because its the best data strcuture to approach this
        // problem because the order of the parantheses is matter

        // push a stack when we see an opening
        // and if we she a closing, it has to match the thing on the top of our stack
        String line = "(){}";
        Stack<Character> s = new Stack<>();
        boolean match = true;
        for (char c : line.toCharArray()) {
            // if we see an opening, we want to push to a stack.
            if (c == '[' || c == '(' || c == '{') {
                s.push(c);
            }
            // if c is containing a closing paranthesis
            // check if the stack is empty and and peek the stack if it has the same closing
            // and pop the stack
            else if (s.isEmpty() == false && c == ']' && s.peek() == '[') {
                s.pop();
            } else if (s.isEmpty() == false && c == '}' && s.peek() == '{') {
                s.pop();
            } else if (s.isEmpty() == false && c == ')' && s.peek() == '(') {
                s.pop();
            }
            // if all of the condisitions aren't met, just print out false
            else {
                System.out.println("False");
                match = false;
            }
        }
        if (match) {
            System.out.println("True");
        }
    }
}