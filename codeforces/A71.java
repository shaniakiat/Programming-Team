import java.util.Scanner;

public class A71{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
        String word = scan.nextLine();
        if(word.length() > 10){
            System.out.println(word.charAt(0) + word.length()-2 + word.charAt(word.length()-1));
        }
        else{
            System.out.println(word);
        }
        }
        scan.close();
    }
}
