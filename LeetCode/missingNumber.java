import java.util.ArrayList;
import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        Arrays.sort(nums);

        if(nums.length - 1 != nums[nums.length-1]){
            System.out.println(nums.length-1);
        } else if( nums[0] != 0){
            System.out.println(0);
        } else{
            for(int i = 1; i < nums.length-1; i++){
                if(nums[i] != i)
                {
                    System.out.println(i);
                }
            }
        }
    
    }
}