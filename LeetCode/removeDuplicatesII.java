import java.util.*;

public class removeDuplicatesII{
    public static void main(String[] args){
        String s = "deeedbbcccbdaa";
        int k = 3;
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            
            if(stack.size() != 0 && stack.peek() == s.charAt(i)){
                stack.push(s.charAt(i));
                if(count == k-1){
                    while(count <= k && stack.peek() == s.charAt(i)){
                        stack.pop();
                        count++;
                    }
                }
            } else{
                stack.push(s.charAt(i));
                count = 0;
            }
        }
        System.out.println(stack.toString());
    }
}