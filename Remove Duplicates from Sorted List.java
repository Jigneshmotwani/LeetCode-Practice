class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode nextNode = current.next;
            if (current.val == nextNode.val) {
                current.next = nextNode.next;
            } else {
                current = current.next;
            }
        }
        return head;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}