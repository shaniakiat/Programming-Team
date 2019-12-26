class subtractProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        int p = 1;
        int s = 0;
        int r = 0;

        char[] a = ("" + n).toCharArray();

        for (int i = 0; i < a.length; i++) {
            p = p * Integer.parseInt("" + a[i]);
            System.out.println(p);
        }
        for (int i = 0; i < a.length; i++) {
            s = s + Integer.parseInt("" + a[i]);
            System.out.println(s);
        }

        r = p - s;
    }
}