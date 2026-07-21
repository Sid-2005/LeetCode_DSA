/**
 * Problem: 19. Remove Nth Node From End of List
 * Approach: Fast & Slow Pointers with Dummy Node - create an n-node gap between fast and slow to locate the target's predecessor in a single pass
 * Time Complexity: O(n) - single traversal of the linked list
 * Space Complexity: O(1) - only pointer manipulation with constant extra memory
 */

package linked_list;

class Solution_21 {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1,head);

        head = dummy;
        ListNode slow = head;
        ListNode fast = head;

        while(n > 0)
        {
            fast = fast.next;
            n--;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}