import java.util.Scanner;

public class A1{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    String s = "";
    int a = sc.nextInt();
    while(a!=0){
      s = s+(a+5)+"\n";
      a = sc.nextInt();
    }
    System.out.println(s);
  }
}