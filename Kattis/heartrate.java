import java.util.Scanner;
public class heartrate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n is the number of cases
        int res = 0;
        for(int i = 0; i < n; i++){
            int b = sc.nextInt();
            double p = sc.nextDouble();

            double BPM = (60*b)/p;
            DecimalFormat(BPM, "0.####");
        }
    }
}