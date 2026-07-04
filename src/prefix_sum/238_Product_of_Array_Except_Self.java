/**
 * Problem: 238. Product of Except Self
 * Approach: Prefix & Suffix Product (Two Pass)
 * Time Complexity: O(n) - one forward pass to compute prefix products, one backward pass to multiply in suffix products
 * Space Complexity: O(1) - only a running product variable used, no extra array besides the output
 */

package prefix_sum;

class Solution_238 {
    public int[] productExceptSelf(int[] nums) {

        int [] res = new int[nums.length];

        int mul = 1;  // left to right

        for (int i = 0; i < nums.length; i++) {
            res[i] = mul;
            mul = mul * nums[i];
        }

        mul = 1; // right to left

        for (int i = nums.length - 1 ; i >= 0 ; i--) {

            res[i] *= mul;
            mul *= nums[i];
        }

        return res;

    }
}