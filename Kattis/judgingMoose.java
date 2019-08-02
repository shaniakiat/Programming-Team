import java.util.Scanner;

class judgingMoose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int t = Math.max(l, r);

        String res = "";
        if( l == 0 && r == 0){
            System.out.println("Not a moose");
        }
        else if(l == r){
            res = "Even";
            System.out.println(res + " " + (t*2));
        } else {
            res = "Odd";
            System.out.println(res + " " + (t*2));
        }
    }
}