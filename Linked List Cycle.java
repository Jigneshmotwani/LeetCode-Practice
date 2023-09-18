/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        ListNode x = head;
        ListNode y = head.next;
        
        while (x!=y){
            if (y == null || y.next == null){
                return false;
            }
            x = x.next;
            y = y.next.next;
        }
        return true;
    }
}