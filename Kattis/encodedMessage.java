import java.util.Scanner;

public class encodedMessage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i < n; i++){
            String text = sc.next();
            int s = (int) Math.sqrt(text.length());
            char[][] m = new char[s][s];

            //find the area of the square and take the square root of it
            // make an two-d char array based on the l and w of the square
            
            // c column
            // r row
            int index = text.length()-1;
            for(int c = s-1; c >= 0; c--){
                for(int r = 0; r < s; r++){
                    m[r][c] = text.charAt(index);
                    index -= 1; 
                }
            }
        
            for(int r = 0; r < s; r++){
                for(int c = 0; c < s; c++){
                    System.out.print(m[r][c]);
                }
            }
            System.out.println("");
        }
    }
}



//TOP
//SEC
//RET

//RSTEEOTCP
//