/**
 * Problem: 16. 3Sum Closest
 * Approach: Sorting + Two Pointers
 * Time Complexity: O(N^2) - Sorting takes O(N log N), and the nested loops take O(N^2), dominating the time.
 * Space Complexity: O(1) or O(log N) depending on the internal implementation of Arrays.sort().
 */

package two_pointers;

import java.util.Arrays;

class Solution_16 {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int close = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(close - target))
                    close = sum;


                if (sum > target) {
                    right--;

                } else if (sum < target) {
                    left++;

                } else
                    return target;


            }


        }
        return close;

    }
}
