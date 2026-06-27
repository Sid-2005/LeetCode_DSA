import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Solution169_2 {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int n = nums.length/2;
        for( Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(entry.getValue() > n)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}
class Solution169_1 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
