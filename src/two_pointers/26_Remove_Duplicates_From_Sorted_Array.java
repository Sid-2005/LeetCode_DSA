/**
 * Problem: 26. Remove Duplicates from Sorted Array
 * Approach: Two Pointers (Reader/Writer)
 * Time Complexity: O(n) - single pass through the array with pointer q
 * Space Complexity: O(1) - in-place modification, no extra data structures
 */

package two_pointers;

class Solution_26 {
    public int removeDuplicates(int[] nums) {

        int count = 1;
        int p = 0;
        int q = 1;

        while( q <= nums.length - 1)
        {
            if(nums[p] != nums[q])
            {
                nums[p+1] = nums[q];
                p++;
                count++;
            }
            q++;
        }
    return count;
    }
}