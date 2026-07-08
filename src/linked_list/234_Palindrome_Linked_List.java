/**
 * Problem: 234. Palindrome Linked List
 * Approach: ArrayList & Two Pointers
 * Time Complexity: O(N) - We traverse the linked list once, and the array once.
 * Space Complexity: O(N) - We store all N elements in a dynamic array.
 * (Note: An O(1) space solution exists by finding the middle and reversing the second half in-place).
 */

package linked_list;

import java.util.ArrayList;
import java.util.List;

class Solution_234 {

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

    public boolean isPalindrome(ListNode head) {

        List<Integer> list = new ArrayList<>();

        while (head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        for (int i = 0; i < list.size() /2; i++) {

            if(list.get(i).equals( list.get(list.size()-1-i))) {
                continue;
            }
            else
                return false;

        }

        return true;
    }
}