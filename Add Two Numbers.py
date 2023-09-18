# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        x = 0
        y = 0
        i = 0
        while l1:
            x += l1.val * 10**i
            l1 = l1.next
            i += 1
        i = 0
        while l2:
            y += l2.val * 10**i
            l2 = l2.next
            i += 1
        z = x + y
        if z == 0:
            return ListNode(0)
        head = ListNode()
        curr = head
        while z:
            curr.next = ListNode(z%10)
            curr = curr.next
            z = z // 10
        return head.next
    