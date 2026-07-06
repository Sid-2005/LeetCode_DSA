/**
 * Problem: 189. Rotate Array
 * Approach: Three-Reversal Technique
 * Time Complexity: O(N) - We reverse parts of the array three times, each in linear time.
 * Space Complexity: O(1) - Rotation is performed in-place without using extra space.
 */

package two_pointers;
class Solution_189 {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length ;

        reverse(nums, 0, nums.length - k -1);
        reverse(nums, nums.length - k , nums.length -1);
        reverse(nums, 0, nums.length - 1);


    }

    void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            if (left == right)
                break;

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}