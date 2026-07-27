/**
 * Problem: 209. Minimum Size Subarray Sum
 * Approach: Dynamic Sliding Window (Custom Flag Initialization)
 * Time Complexity: O(N) - Both pointers only traverse the array once.
 * Space Complexity: O(1) - Only integer variables used.
 */

package sliding_window;

class Solution_209 {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int left = 0;
        int length = 0;
        int flag = 1;

        for(int right = 0 ; right < nums.length ; right ++)
        {
            sum = sum + nums[right];

            while(sum >= target)
            {
                if(flag == 1)
                {
                    length = right + 1 - left;
                    flag = 0;
                }

                length = Math.min(length ,right + 1 - left );
                sum = sum - nums[left];
                left++;
            }


        }
        return length;
    }
}