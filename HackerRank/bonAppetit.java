import java.util.ArrayList;

class bonAppetit {
    public static void main(String[] args) {
        // remove the kth index from the list
        ArrayList<Integer> bill = new ArrayList<>();
        // loop through the list and get the total
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        int k = 1;
        int b = 12;
        bill.remove(k);
        int a = 0;
        // divide the total by 2 and this is the actual
        for (int i = 0; i < bill.size(); i++) {
            a += bill.get(i);
        }
        a = a / 2;
        // charge - actual
        if ((b - a) == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - a);
        }
    }
}