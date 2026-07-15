/**
 * Problem: 75. Sort Colors
 * Approach: Three Pointers (Dutch National Flag Algorithm)
 * Time Complexity: O(N) - We traverse the array exactly once.
 * Space Complexity: O(1) - We only use three integer pointers for swapping, requiring no extra space.
 */

package two_pointers;
class Solution_75 {
    public void sortColors(int[] nums) {

        int low = 0 ;
        int mid = 0 ;
        int high = nums.length - 1 ;

        while(mid <= high)
        {
            if(nums[mid] == 0 )
            {
                nums[mid] = nums[low];
                nums[low] = 0 ;
                low++;
                mid++;
            }
            else if( nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = nums[mid];
                high -- ;
            }


        }

    }
}