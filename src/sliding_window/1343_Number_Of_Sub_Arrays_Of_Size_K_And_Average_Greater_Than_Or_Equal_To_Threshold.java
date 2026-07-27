/**
 * Problem: 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 * Approach: Fixed-Size Sliding Window
 * Time Complexity: O(n) - single pass, each element added/removed from window once
 * Space Complexity: O(1) - only a few running variables used
 */

package sliding_window;

class Solution_1343{
    public int numOfSubarrays_1343(int[] arr, int k, int threshold) {

        int left = 0;
        int right = k -1;
        int count = 0 ;
        int sum = 0;
        int targetSum = k * threshold;
        int n = arr.length - 1;

        for(int i = 0 ; i < k ; i++)
            sum = sum + arr[i];

        if(sum >= targetSum) {
            count++;
        }


        while( right < n )
        {
            sum = sum - arr[left] + arr[right+1];


        if(sum >= targetSum) {
            count++;
        }

        left++;
        right++;

        }
        return count;
    }
}