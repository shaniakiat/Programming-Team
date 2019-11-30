public class reverseList {
    public static void main(String[] args) {

    }

    public static ListNode reverseListMethod(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode l = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return l;
    }
}