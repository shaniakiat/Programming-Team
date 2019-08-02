import java.util.Scanner;

public class isithalloween{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        boolean res = false;
        if(s.equals("OCT 31") || s.equals("DEC 25")){
            res = true;
        }
        if(res){
            System.out.println("yup");
        } else{
            System.out.println("nope");
        }
    }
}

