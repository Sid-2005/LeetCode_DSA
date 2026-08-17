/**
 * Problem: 739. Daily Temperatures
 * Approach: Monotonic Stack (Storing Indices)
 * Time Complexity: O(N) - We iterate through the temperatures array of length N. Even with the nested while loop, every index is pushed onto the stack exactly once and popped at most once.
 * Space Complexity: O(N) - In the worst-case scenario (e.g., temperatures are constantly decreasing), the stack will store all N indices at the same time.
 */

package stacks;

import java.util.Stack;

class Solution_739 {

    public int[] dailyTemperatures(int[] temp) {

        int n = temp.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int currentTemp = temp[i];

            while( !stack.isEmpty() && currentTemp > temp[stack.peek()] )
            {
                int prevDay = stack.pop();
                ans[prevDay] = i - prevDay;
            }
            stack.push(i);

        }

        return ans;
    }
}