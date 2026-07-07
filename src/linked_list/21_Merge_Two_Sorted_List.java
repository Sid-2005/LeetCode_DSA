/**
 * Problem: 21. Merge Two Sorted Lists
 * Approach: In-place merge - track shorter list's "next" pointer separately, relink as you walk
 * Time Complexity: O(n + m) - single pass through both lists combined
 * Space Complexity: O(1) - no new nodes created, existing nodes relinked
 */

package linked_list;

class Solution_26 {

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

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {

        ListNode Main_Head = new ListNode();


        if (head1 == null)
            return head2;
        else if (head2 == null)
            return head1;

        else if (head1.val <=  head2.val)
        {
            Main_Head = head1;

            ListNode nxt = new ListNode();
            nxt = head1.next;

            while (head2 != null && nxt != null) {

                if (nxt.val <= head2.val) {

                    head1.next = nxt;
                    nxt = nxt.next;
                    head1 = head1.next;

                } else {

                    head1.next = head2;
                    head2 = head2.next;
                    head1 =head1.next;
                }
            }

            if (nxt == null) {
                head1.next = head2;
            }
            if (head2 == null) {
                head1.next = nxt;
            }


        }
        else
        {
            Main_Head = head2;

            ListNode nxt = new ListNode();
            nxt = head2.next;

            while (head1 != null && nxt != null) {

                if (nxt.val <= head1.val) {

                    head2.next = nxt;
                    nxt = nxt.next;
                    head2 = head2.next;

                } else {

                    head2.next = head1;
                    head1 = head1.next;
                    head2 =head2.next;
                }
            }

            if (nxt == null) {
                head2.next = head1;
            }

            if (head1 == null) {
                head2.next = nxt;
            }

        }


        return Main_Head;
    }
}