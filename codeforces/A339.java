import java.util.Scanner;

public class A339{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String newStr = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)!='+'){
                newStr = newStr + s.charAt(i);
            }
        }
        String str ="";
        for(int i = 0; i < newStr.length()-1; i++){
            if(newStr.charAt(i)>newStr.charAt(i+1)){
                String string = "+";
				str = str + newStr.charAt(i+1) +string;
            }
        }
        System.out.println(str);
    }
}