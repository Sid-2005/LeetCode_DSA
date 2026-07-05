/**
 * Problem: 876. Middle of the Linked List
 * Approach: Slow/Fast Pointer (classic fast.next.next, slow.next per iteration)
 * Time Complexity: O(n) - fast pointer traverses list in half the iterations
 * Space Complexity: O(1) - only two pointer variables used
 */

package linked_list;
class Solution_876 {

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

    public ListNode middleNode(ListNode head) {

        ListNode slow_ptr = head ;
        ListNode fast_ptr = head ;


        while(fast_ptr != null && fast_ptr.next != null)
        {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;

        }

        return slow_ptr;
    }
}