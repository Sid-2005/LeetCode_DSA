/**
 * Problem: 344. Reverse String
 * Approach: Two Pointers (In-Place Swap)
 * Time Complexity: O(N) - We swap N/2 pairs of characters.
 * Space Complexity: O(1) - Variables evaluate in constant extra memory.
 */

package two_pointers;

class Solution344 {
    public void reverseString(char[] s) {

        for(int i = 0 ;  i < s.length/2 ; i++)
        {
            char temp = s[s.length -i -1];
            s[s.length-i-1] = s[i];
            s[i] =temp;

        }
    }
}