class titleToNumber {
    public static void main(String[] args) {
        String s = "ABA";
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String[] alphabet =
        // {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}
        //
        if (s.length() == 1) {
            if (a.contains(s)) {
                System.out.println(a.indexOf(s) + 1);
            }
        }
        // } else {
        // int num = (s.length() - 1) * 26;
        // String c = s.substring(s.length() - 1);
        // System.out.println(num + a.indexOf(c) + 1);
        // }
        else {
            int res = 26;
            for (int i = 0; i < s.length() - 1; i++) {
                res *= 26;
            }
            res += a.indexOf(s.substring(s.length() - 1)) + 1;
            System.out.println(res);
        }
    }
}