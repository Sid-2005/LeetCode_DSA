/**
 * Problem: 1480. Running Sum of 1d Array
 * Approach: Prefix Sum (In-Place)
 * Time Complexity: O(N) - We iterate through the array exactly once.
 * Space Complexity: O(1) - We mutate the input array directly (or O(N) if returning a new array).
 */

package prefix_sum;
/*class prefix_sum.Solution_1480 {
    public int[] runningSum(int[] nums) {

        int sum = 0;
        int [] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            res[i] = sum;
        }

        return res;

    }
}
*/

class Solution_1480 {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;

    }
}
