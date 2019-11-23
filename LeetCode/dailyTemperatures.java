public class dailyTemperatures {
    public static void main(String[] args) {
        int[] T = { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 };
        int[] res = getDailyTemperatures(T);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] getDailyTemperatures(int[] T) {
        int n = T.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            boolean found = false; // found the warmer temperature
            int count = 0;
            int current = T[i];
            for (int j = i + 1; j < n; j++) {
                int nextDay = T[j];
                if (nextDay <= current) {
                    count++;
                }
                if (nextDay > current) {
                    found = true;
                    count++;
                    break;
                }
            }
            if (found) {
                res[i] = count;
            } else {
                res[i] = 0;
            }

        }
        return res;
    }
}