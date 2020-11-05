public class findDisappearedNumbers {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbersFunction(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }
        return list;

    }
}
