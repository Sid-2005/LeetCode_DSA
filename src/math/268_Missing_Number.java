/**
 * Problem: 268. Missing Number
 * Approach: Math (Sum of First N Natural Numbers)
 * Time Complexity: O(N) - We calculate the expected sum mathematically and iterate once to find the actual sum.
 * Space Complexity: O(1) - Only constant extra variables are used.
 */

package math;

class Solution_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n * (n + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        return total - sum;
    }
}