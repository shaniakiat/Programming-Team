import java.util.*;

public class Recursion{
    public static void main(String[] args){
        char[] input = {'h','e','l','l','o'};
        System.out.println(printReverse(input));

    }
    public static String printReverse(char[] s){
        if(s.length == 0){
            return "";
        } else{
            return printReverse(Arrays.copyOfRange(s,1,s.length)) + s[0];
        }

    }

}