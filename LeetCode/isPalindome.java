public class isPalindome {
    public static void main(String[] args) {
        String s = "";
        String rS = "";
        ListNode c = head; // current
        ListNode n = null; // next
        ListNode p = null; // prev

        int v = 0;
        while (c != null) {
            v = c.val; // getting the val
            s = s + v + ""; // adding the val to string

            // reverse the pointers
            n = c.next;
            c.next = p;
            p = c;
            c = n;

        }
        head = p;
        c = head;

        while (c != null) {
            v = c.val; // getting the val
            rS = rS + v + ""; // adding the val to string

            c = c.next;
        }

        if (s.equals(rS)) {
            return true;
        } else {
            return false;
        }
    }
}