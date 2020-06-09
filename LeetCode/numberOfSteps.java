public class numberOfSteps {
    public static void main(String[] args) {
        int num = 14;
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        System.out.print(count);
    }
}