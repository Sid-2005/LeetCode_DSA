/**
 * Problem: 141. Linked List Cycle
 * Approach: Slow/Fast Pointer (Floyd's Cycle Detection) - if fast catches slow, a cycle exists
 * Time Complexity: O(n) - fast pointer traverses at most n nodes before meeting slow or hitting null
 * Space Complexity: O(1) - only two pointer variables used, no extra data structures
 */

package linked_list;

class Solution_141 {

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

    public boolean hasCycle(ListNode head) {

        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null ) {

            fast_ptr =fast_ptr.next.next;
            slow_ptr = slow_ptr.next;

            if(fast_ptr == slow_ptr)
                return true;

        }

        return false;

    }
}
