/**
 * Problem: 83. Remove Duplicates from Sorted List
 * Approach: Iterative Two Pointers
 * Time Complexity: O(N) - We traverse the linked list exactly once.
 * Space Complexity: O(1) - We modify the list in-place using constant extra space.
 */

package linked_list;
class Solution_83 {

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

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return head;

        if (head.next == null)
            return head;

        ListNode prev = head;
        ListNode Main_head = head;
        head = head.next;

        while (head != null)
        {
            if (head.val == prev.val)
            {
                head = head.next;
                prev.next = head;
                continue;
            }

            prev = head;
            head =head.next;

        }

        return Main_head;

    }
}