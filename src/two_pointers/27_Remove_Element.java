/**
 * Problem: 27. Remove Element
 * Approach: Two Pointers (Reader/Writer)
 * Time Complexity: O(N) - We traverse the array exactly once.
 * Space Complexity: O(1) - Array is modified in-place.
 */

package two_pointers;

class Solution_27{

    public int removeElement(int[] nums, int val) {

        int q = 0 ;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != val ){
                nums[q] =  nums[i];
                q++;
            }

        }
        return q;
    }
}