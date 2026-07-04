package binary_search;

/**
 * Problem: 704. Binary Search
 * Approach: Binary Search
 * Time Complexity: O(log N) - We halve the search space at every iteration.
 * Space Complexity: O(1) - Evaluated using constant memory for pointers.
 */

class Solution_704 {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2 ;

            if(target == nums[mid])
                return mid;

            if(target < nums[mid])
                {
                    high = mid - 1;
                }
            if(target > nums[mid])
                {
                    low = mid + 1;
                }

        }
    return -1;

    }
}