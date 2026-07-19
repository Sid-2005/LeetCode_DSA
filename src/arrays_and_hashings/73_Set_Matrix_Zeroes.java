/**
 * Problem: 73. Set Matrix Zeroes
 * Approach: Matrix Traversal with Tracker Arrays
 * Time Complexity: O(M \times N) - We iterate through the M x N matrix exactly twice.
 * Space Complexity: O(M + N) - We use two boolean arrays to track the rows and columns that need to be zeroed.
 */

package arrays_and_hashings;

class Solution_73 {
    public void setZeroes(int[][] matrix) {

        boolean[] length = new boolean[matrix.length];
        boolean[] breath = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    length[i] = true;
                    breath[j] = true;

                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (length[i] == true || breath[j] == true)
                    matrix[i][j] = 0;

            }
        }


    }
}
