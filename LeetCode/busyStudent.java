public class busyStudent {
    public static void main(String[] args) {
        int[] startTime = { 4 };
        int[] endTime = { 4 };
        int queryTime = 5;

        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}