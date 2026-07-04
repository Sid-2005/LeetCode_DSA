/**
 * Problem: 136. Single Number
 * Approach: HashMap
 * Time Complexity: O(N) - We traverse the array once to populate the map.
 * Space Complexity: O(N) - In the worst case, we store nearly N elements in the HashMap.
 */

package arrays_and_hashings;

import java.util.HashMap;

class Solution_136 {

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int i : map.keySet()) {

            if (map.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}
