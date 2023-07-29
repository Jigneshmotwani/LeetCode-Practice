class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null && n == 1) {
            return null;
        }
        ListNode head2 = head;
        int count = 0;
        while (head2.next != null && head2 != null) {
            count += 1;
            head2 = head2.next;
        }
        int l = count - n;
        if (l < 0) {
            head = head.next;
            return head;
        }
        ListNode slow = head;
        for (int i = 0; i < l; i++) {
            slow = slow.next;
        }
        slow.next = slow.next.next;
        // head.next.next.next = head.next.next.next.next; for l = 3
        return head;
    }
}