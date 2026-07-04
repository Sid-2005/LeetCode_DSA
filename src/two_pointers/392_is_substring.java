package two_pointers;

/**
 * Problem: 392. Is Subsequence
 * Approach: Two Pointers
 * Time Complexity: O(N) - We traverse string t once using the two pointers.
 * Space Complexity: O(1) - Evaluated using constant memory for pointers.
 */

class Solution_392 {
    public boolean isSubsequence(String s, String t) {

        int ptr1 = 0 ;
        int ptr2 = 0 ;

        if(s.isEmpty())
            return true;

        while( ptr2 < t.length() )
        {

            if(s.charAt(ptr1) == (t.charAt(ptr2)))
            {
                ptr2++;
                ptr1++;
            }
            else {
                ptr2++;
            }

            if(ptr1 == s.length())
                return true;
        }
        return false;
    }
}