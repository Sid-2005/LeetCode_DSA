/**
 * Problem: 485. Max Consecutive Ones
 * Approach: Dynamic Sliding Window / State Tracking
 * Time Complexity: O(N) - We traverse the array exactly once.
 * Space Complexity: O(1) - We only use two integer variables for tracking.
 */

package sliding_window;

class Solution_485 {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max_sum = -1;
        int sum = 0;

        for(int i = 0 ; i < nums.length ; i ++) {

            if(nums[i] == 0) {

                if(max_sum < sum) {
                    max_sum = sum;
                }

                sum = 0;
            }

            else {
                sum++;
            }
        }

        return (max_sum < sum) ? sum : max_sum;
    }
}