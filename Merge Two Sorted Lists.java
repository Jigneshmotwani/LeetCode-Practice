import java.util.List;

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

/*
 * class Solution {
 * public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
 * 
 * if (list1 == null) {
 * return list2;
 * } else if (list2 == null) {
 * return list1;
 * }
 * 
 * ListNode result = new ListNode();
 * 
 * 
 * if (list1.val >= list2.val) {
 * result.next = recursion(list1.val, result, list1, list2);
 * list1 = list1.next;
 * } else {
 * result.next = recursion(list1.val, result, list1, list2);
 * list2 = list2.next;
 * }
 * 
 * 
 * if (list1 != null) {
 * result.next = list1;
 * }
 * if (list2 != null) {
 * result.next = list2;
 * }
 * 
 * return result;
 * }
 * 
 * ListNode recursion(int val, ListNode next, ListNode list1, ListNode list2) {
 * if (list1 != null && list2 != null) {
 * if (list1.val >= list2.val) {
 * 
 * return new ListNode(list1.val, recursion(val, next, list1.next, list2));
 * 
 * } else {
 * return new ListNode(list2.val, recursion(val, next, list1, list2.next));
 * }
 * }
 * else
 * return null;
 * }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
