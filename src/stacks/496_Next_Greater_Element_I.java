/**
 * Problem: 496. Next Greater Element I
 * Approach: Monotonic Stack & HashMap
 * Time Complexity: O(N + M) - We iterate through nums2 (length M) pushing and popping each element at most once. Then we iterate through nums1 (length N) for O(1) HashMap lookups.
 * Space Complexity: O(M) - In the worst-case scenario (e.g., a descending array), the Stack and HashMap will store all M elements from nums2.
 */

package stacks;

import java.util.HashMap;
import java.util.Stack;

class Solution_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            int currentNumber = nums2[i];

            while( !stack.isEmpty() && currentNumber > stack.peek() )
            {

               map.put(stack.pop(),currentNumber);
            }
            stack.push(currentNumber);

        }

        for (int i = 0; i < nums1.length; i++) {

            nums1[i] = map.getOrDefault(nums1[i], -1);

        }

        return nums1;
    }
}