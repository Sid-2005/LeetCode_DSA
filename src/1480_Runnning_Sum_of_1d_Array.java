/*class Solution_1480 {
    public int[] runningSum(int[] nums) {

        int sum = 0;
        int [] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            res[i] = sum;
        }

        return res;

    }
}
*/

class Solution {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;

    }
}
