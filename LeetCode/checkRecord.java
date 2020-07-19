public class checkRecord {
    public static void main(String[] args) {
        String s = "PPALLP";
        if (s.contains("LLL")) {

        } else if (s.contains("A")) {
            int i = s.indexOf("A");
            s = s.substring(0, i) + s.substring(i + 1);
            if (s.contains("A")) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}