/**
 * Problem: 203. Remove Linked List Elements
 * Approach: Dummy Node & Two Pointers
 * Time Complexity: O(N) - We traverse the linked list exactly once.
 * Space Complexity: O(1) - Pointers evaluate the list in-place without allocating new memory.
 */


package linked_list;

class Solution_203 {

    public class ListNode {

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

    class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            if (curr.val == val) {

                curr = curr.next;
                prev.next = curr;

            } else {

                prev =curr;
                curr = curr.next;
            }

        }

        return dummy.next;
    }
}
}