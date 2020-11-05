public class CodingFriends {
    public static void main(String[] args) {
        int samDaily = 3;
        int kellyDaily = 5;
        int difference = 5;
        int samStarting = difference + samDaily;

        int days = 0;
        boolean passed = false;
        int samResult = samStarting;
        int kellyResult = kellyDaily;
        while (!passed) {
            days++;
            if (kellyResult >= samResult) {
                passed = true;
            }
            if (samResult - kellyResult > kellyDaily) {
                days = -1;
                break;
            }
            samResult += samDaily;
            kellyResult += kellyDaily;
        }
        System.out.println(days);
    }
}
