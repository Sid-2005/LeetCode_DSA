/**
 * Problem: 1876. Substrings of Size Three with Distinct Characters
 * Approach: Fixed-Size Sliding Window (Direct Comparison)
 * Time Complexity: O(N) - We traverse the string exactly once.
 * Space Complexity: O(1) - We only use integer variables for tracking.
 */

package sliding_window;

class Solution_1876 {
    public int countGoodSubstrings(String s) {

        int left = 0;
        int right = 2;
        int valid = 0;

        while(right <= s.length() - 1)
        {
            if (s.charAt(left) != s.charAt(left + 1) &&
                s.charAt(left + 1) != s.charAt(left + 2) &&
                s.charAt(left) != s.charAt(left + 2)) {

                valid++;
            }

            left++;
            right++;
        }
        return valid;
    }
}