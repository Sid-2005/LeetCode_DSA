/**
 * Problem: 217. Contains Duplicate
 * Approach: HashSet
 * Time Complexity: O(N) - Inserting and checking elements in a HashSet takes O(1) on average.
 * Space Complexity: O(N) - We may store up to N distinct elements in the HashSet.
 */

package arrays_and_hashings;

import java.util.HashMap;

class Solution_217 {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i],i);

        }
        return false;

    }
}