import java.util.Scanner;

public class STRHH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            String s = sc.next();
            String newS = ""+s.charAt(0);
            for(int j = 0; j < s.length(); j++){
                int k = (int) Math.pow(2,j+1);
                if(k<s.length()){
                    newS += s.charAt(k);
                }
            }
            int length = newS.length();
            if(length%2 == 1){
                length++;
            }
            System.out.println(newS.substring(0,length/2));
            sc.nextLine();
        }
        sc.close();
    }
}