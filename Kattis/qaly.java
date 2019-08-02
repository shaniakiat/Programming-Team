import java.text.DecimalFormat;
import java.util.Scanner;

public class qaly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");

        int n = sc.nextInt();
        double res = 0;

        for(int i = 0; i < n; i++){
            double q = sc.nextDouble();
            double y = sc.nextDouble();
            res += (q*y);
        }
        System.out.println(df.format(res));
    }
}