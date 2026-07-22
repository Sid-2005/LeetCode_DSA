/**
 * Problem: 744. Find Smallest Letter Greater Than Target
 * Approach: Binary Search (find first index where letters[idx] > target, with wraparound)
 * Time Complexity: O(log n) - standard binary search halving the search space
 * Space Complexity: O(1) - only pointer variables used
 */

package binary_search;

class Solution_744 {
    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow

            if (letters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return letters[left % letters.length];
    }
}