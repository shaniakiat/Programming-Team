import java.util.*;

public class sortingArray{
    public static void main(String[] args){
        Integer[] nums = {3,4,2,5,2,3,4,3,6};
        
        PriorityQueue<Integer> heapAscending = new PriorityQueue<>((a, b) -> (a - b));

        for (Integer n : nums) {
            heapAscending.add(n);
        }
        System.out.println(heapAscending.toString());

        PriorityQueue<Integer> heapDescending = new PriorityQueue<>((a, b) -> (b - a));

        for (Integer n : nums) {
            heapDescending.add(n);
        }
        System.out.println(heapDescending.toString());


        // for(int i = 0; i < nums.length; i++){
        //     System.out.print(nums[i] +", ");
        // }
        // System.out.println();
        // Arrays.sort(nums, (Integer a, Integer b) -> b - a );
        // System.out.println("Descending:");
        // for(int i = 0; i < nums.length; i++){
        //     System.out.print(nums[i] +", ");
        // }
    }
}
