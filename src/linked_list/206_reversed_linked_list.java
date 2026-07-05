/**
 * Problem: 206. Reverse Linked List
 * Approach: Iterative pointer reversal (prev, current, next)
 * Time Complexity: O(n) - single pass through all n nodes
 * Space Complexity: O(1) - only three pointer variables used, no extra data structures
 */

package linked_list;

class Solution_206 {
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

    public ListNode reverseList(ListNode head) {

        ListNode current = head ;
        ListNode prev = null ;
        ListNode nxt = null ;


        while (current!= null)
        {
            nxt = current.next;

            current.next = prev;

            prev = current;
            current = nxt;


        }
        return prev;
    }


}