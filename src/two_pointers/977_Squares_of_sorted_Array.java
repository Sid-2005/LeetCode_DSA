/**
 * Problem: 977. Squares of a Sorted Array
 * Approach: Two Pointers (Opposite Ends)
 * Time Complexity: O(N) - We compare elements and fill the result array in one pass.
 * Space Complexity: O(N) - We are required to create a new array to store the result.
 */

package two_pointers;

class Solution_977 {
    public int[] sortedSquares(int[] nums) {

        int left = 0 ;
        int right = nums.length-1 ;
        int index = nums.length-1 ;

        int [] res = new int[nums.length];

        while(left <= right)
        {
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
            {
                res[index] = nums[left] * nums[left];
                left++;
            }
            else
            {
                res[index] = nums[right] * nums[right];
                right--;
            }
            index--;

        }
        return res;
        
    }
}