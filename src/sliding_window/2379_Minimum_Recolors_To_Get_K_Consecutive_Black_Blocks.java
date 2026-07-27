/**
 * Problem: 2379. Minimum Recolors to Get K Consecutive Black Blocks
 * Approach: Fixed-Size Sliding Window
 * Time Complexity: O(n) - single pass, each character visited a constant number of times
 * Space Complexity: O(1) - only a few running variables used
 */

package sliding_window;

class Solution_2379 {
    int minimumRecolors(String blocks, int k) {

        int left = 0;
        int n = blocks.length();
        int right = k - 1;
        int finalCount;
        int countW = 0;

        for (int i = 0; i < k; i++)
            if (blocks.charAt(i) == 'W')
                countW++;
        finalCount = countW;

        while (right < n - 1) {

            if (blocks.charAt(left) == 'W')
                countW--;

            if (blocks.charAt(right + 1) == 'W')
                countW++;

            finalCount = Math.min(finalCount, countW);

            left++;
            right++;
        }
        return finalCount;
    }
}