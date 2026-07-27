/**
 * Problem: 2461. Maximum Sum of Distinct Subarrays With Length K
 * Approach: Fixed-Size Sliding Window with HashMap (frequency count)
 * Time Complexity: O(n) - single pass, each element added/removed from map once
 * Space Complexity: O(k) - map holds at most k distinct elements at a time
 */

package sliding_window;
import java.util.HashMap;

class Solution_2461 {
    public long maximumSubarraySum(int[] arr, int k) {

        int left = 0;
        int right = k-1;
        long currsum = 0;
        long res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < k ; i ++)
        {
            currsum = currsum + arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        if( map.size() == k )
            res = currsum;

        while(right < arr.length -1 )
        {

            map.put(arr[left],map.get(arr[left]) - 1);
            if(map.get(arr[left])  == 0)
                map.remove(arr[left]);

            if(map.containsKey(arr[right+1]))
                map.put(arr[right+1],map.get(arr[right+1])+  1);

            else
                map.put(arr[right+1],1);


            currsum = currsum - arr[left] +arr[right+1];

            if( map.size() == k )
                {
                    res = Math.max(res,currsum);

                }
        left++;
        right++;


        }
        return res;
    }
}