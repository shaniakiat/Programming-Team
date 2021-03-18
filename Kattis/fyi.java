import java.util.Scanner;

public class fyi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String areaCode = s.substring(0, 3);

        if(Integer.parseInt(areaCode) == 555){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        sc.close();
        
    }
}
