import java.util.Scanner;

public class finalexam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalScore = 0;
        String answerN = sc.nextLine();
        for(int i = 0; i < n; i++){
            String answerN1 = sc.nextLine();

            if(answerN.equals(answerN1)){
                totalScore++;
            }
            answerN = answerN1;
        }

        System.out.println(totalScore);
        sc.close();
    }
}
