/**
 * Problem: 167. Two Sum II - Input Array Is Sorted
 * Approach: Two Pointers (Opposite Ends)
 * Time Complexity: O(N) - We shrink the search space from both ends, taking at most N steps.
 * Space Complexity: O(1) - Pointers evaluate the array in-place.
 */

package two_pointers;

class Solution_167 {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            } else if (currentSum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }
}