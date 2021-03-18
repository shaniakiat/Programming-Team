import java.util.Scanner;

public class kafkaesque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        
        int previousStep = sc.nextInt();
        int totalTrip = 1;
        for(int i = 0; i < k-1; i ++){
            int nextStep = sc.nextInt();
            
            if(nextStep < previousStep){
                totalTrip++;
            }
            previousStep = nextStep;
        }

        System.out.println(totalTrip);

        sc.close();
    }
}
