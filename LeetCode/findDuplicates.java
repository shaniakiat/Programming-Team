public class findDuplicates {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicatesFunction(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> dups = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        for (int n : map.keySet()) {
            int v = map.get(n);
            if (v == 2) {
                dups.add(n);
            }
        }
        return dups;
    }
}
