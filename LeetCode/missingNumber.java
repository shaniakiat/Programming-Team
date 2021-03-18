import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        // int[] nums = { 1,2,3,4,5,6,8,9,10 };

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String allNumbers = sc.nextLine() + "";
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1 ; i < n; i++){
            System.out.println(i);
            if(i+"".length() == 2){
                int currNumber = Integer.parseInt(allNumbers.substring(0,2));
                System.out.println("curNumber:" + currNumber);
                allNumbers = allNumbers.substring(2);
                System.out.println(allNumbers);
                System.out.println();
                list.add(currNumber);
                i = i + 1;
            } else if(i+"".length() == 3){
                int currNumber = Integer.parseInt(allNumbers.substring(0,3));
                System.out.println("curNumber:" + currNumber);
                allNumbers = allNumbers.substring(3);
                System.out.println(allNumbers);
                System.out.println();
                list.add(currNumber);
                i = i + 2;
            } else{
                int currNumber = Integer.parseInt(allNumbers.substring(0,1));
                System.out.println("curNumber:" + currNumber);
                allNumbers = allNumbers.substring(1);
                System.out.println(allNumbers);
                System.out.println();
                list.add(currNumber);
            }
            // System.out.println(allNumbers);
        }

        System.out.println(list);
        // Arrays.sort(nums);

        // if(nums.length - 1 != nums[nums.length-1]){
        //     System.out.println(nums.length-1);
        // } else if( nums[0] != 0){
        //     System.out.println(0);
        // } else{
        //     for(int i = 1; i < nums.length-1; i++){
        //         // System.out.println(nums[i] + ": ");
        //         if(nums[i-1] != i)
        //         {
        //             System.out.println(i);
        //         }
        //     }
        // // }

        for(int i = 1; i <= 100; i++){
            System.out.print(i);
        }
    
    }
}