/**
 * Problem: 901. Online Stock Span
 * Approach: Monotonic Stack (Storing int[]{price, span})
 * Time Complexity: O(1) Amortized - Each call to next() pushes exactly one element onto the stack and pops elements at most once. While the while-loop may run multiple times in a single call, across N calls, each element is popped at most once. Therefore, the average time per call is O(1).
 * Space Complexity: O(N) - In the worst-case scenario (e.g., strictly decreasing stock prices), no prices are ever popped, and the stack will store all N prices and their spans.
 */

package stacks;
import java.util.Stack;

class StockSpanner {

    Stack<int[]> stack = new Stack<>();
    public StockSpanner() {

    }

    public int next(int price) {

        int ans = 1;
        while( !stack.isEmpty() && price >= stack.peek()[0] )
        {
            int [] temp = stack.pop();
            ans = ans + temp[1];

        }
        stack.push(new int[] {price , ans} );

        return ans;
    }

}
