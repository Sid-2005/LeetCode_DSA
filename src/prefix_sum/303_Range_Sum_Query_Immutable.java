/**
 * Problem: 303. Range Sum Query - Immutable
 * Approach: Prefix Sum
 * Time Complexity: O(1) per sumRange query - just two array lookups and a subtraction (O(n) one-time cost in constructor to build prefix array)
 * Space Complexity: O(n) - prefix array stores n cumulative sums
 */

package prefix_sum;
class NumArray_303 {

    int [] nums ;
    int [] prefix;

    public NumArray_303(int[] nums) {

        this.nums = nums;
        int sum = 0;
        prefix =new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++)
            {
                sum = sum + nums[i];
                prefix[i] = sum;
            }

    }

    public int sumRange(int left, int right) {


            if(left == 0)
                return prefix[right];

            else{
                return prefix[right] -prefix[left-1];
            }


    }
}