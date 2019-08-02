import java.util.Scanner;

public class pachydermpeanutpacking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        while(n!=0){
            double[] size = new double[];
            for(int i = 0; i < n; i ++ ){
                for(int j = 0; j < 4; j++){
                    size[j] == sc.nextDouble();
                }
                String nameSize = sc.next();
                sc.nextLine();
                hmap.put(size, nameSize);
            } 
            n = sc.nextInt();
            for(int i = 0; i < n; i++){
                double pX = sc.nextDouble();
                double pY = sc.nextDouble();
                String pY= sc.next();
                sc.nextLine();

                // compare x
                
                // compare y


            }

            n = sc.nextInt();
        }
    }
}