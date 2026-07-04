/**
 * Problem: 1. Two Sum
 * Approach: One-Pass HashMap
 * Time Complexity: O(N) - We traverse the array exactly once.
 * Space Complexity: O(N) - In the worst case, we store N-1 elements in the HashMap.
 */

package arrays_and_hashings;

import java.util.*;

class Solution1{
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<> ();

        for(int i = 0 ; i < nums.length ; i++)
        {
            int find  = target - nums[i];

            if(map.containsKey(find))
            {
                return new int [] {map.get(find),i};
            }

            map.put(nums[i],i);
        }

        return null;

    }
}

/*


class Solution {
    public int[] twoSum(int[] nums, int target) {


        int [] res = new int [2];

        for(int i = 0 ; i  < nums.length - 1 ; i ++)
        {
            for(int j = i+1 ; j < nums.length ; j++)
            {
                if(nums[i] + nums[j]  == target)
                {
                    res[0] = i;
                    res[1] = j;

                    return res;
                }
            }
        }

                    res[0] = -1;
                    res[1] = -1;

        return res;

    }
}
 */