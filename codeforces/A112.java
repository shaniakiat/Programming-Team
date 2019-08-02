import java.util.Scanner;

public class A112{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine().toLowerCase();
        String second = sc.nextLine().toLowerCase();

        int val = 0;

        if(first.compareTo(second) > 0){
            val++;
        }
        else if(first.compareTo(second) <0){
            val--;
        }
        else{
            val =0;
        }
        System.out.println(val);
    }
}