public class removeElement{
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(j);
    }
}