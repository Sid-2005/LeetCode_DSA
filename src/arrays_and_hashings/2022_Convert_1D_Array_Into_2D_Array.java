/**
 * Problem: 2022. Convert 1D Array Into 2D Array
 * Approach: Array Iteration / Index Mapping
 * Time Complexity: O(m * n) - We visit every element exactly once to copy it into the new array.
 * Space Complexity: O(1) auxiliary space (excluding the O(m * n) space required for the output array itself).
 */

package arrays_and_hashings;
class Solution_2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {

        if( m*n != original.length )
            return new int [] [] {};

        int [] [] res = new int [m] [n];

        int index = 0 ;
        for(int i = 0 ; i < res.length ; i++)
        {
            for(int j = 0 ; j < res[i].length ; j++ )
            {
                res[i][j] = original[index] ;
                index++;
            }
        }
        return res;
    }
}
