import java.util.Scanner;
class hissingMicrophone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == 's' && s.charAt(i) == 's'){
                cnt = 2;
            }
        }
        if(cnt >= 2){
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
