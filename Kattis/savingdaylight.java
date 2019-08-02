import java.util.Scanner;

class savingdaylight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.isEmpty()){
                break;
            }
            String[] string = str.split("\\s+");
            
            String rise = string[3];
            String set = string[4];

            int riseHours = Integer.parseInt(rise.substring(0,1));
            int riseMinutes = Integer.parseInt(rise.substring(2));
            // System.out.println(riseHours + " " + riseMinutes);

            int setHours = Integer.parseInt(set.substring(0,2));
            int setMinutes = Integer.parseInt(set.substring(3));
            // System.out.println(setHours + " " + setMinutes);

            // code
            int hr = 0;
            int min = 0;
            if(setMinutes < riseMinutes){
                min = setMinutes - riseMinutes;
                min +=  60;
                hr -= 1;
            }
            else {
                min = setMinutes - riseMinutes;
            }
            hr += (setHours - riseHours);

            System.out.println(string[0] + " " + string[1] + " " + string[2] + " " + hr + " hours " + min + " minutes");
        }
        sc.close();
    }
}