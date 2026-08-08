/**
 * Problem: 904. Fruit Into Baskets
 * Approach: Dynamic Sliding Window with HashMap
 * Time Complexity: O(N) - We iterate through the array once with the right pointer. The left pointer also moves at most N times overall, resulting in linear time.
 * Space Complexity: O(1) - The HashMap will store a maximum of 3 distinct fruit types at any given time, making the auxiliary space constant regardless of input size.
 */

package sliding_window;

import java.util.HashMap;

class Solution_904 {
    public int totalFruit(int[] fruits) {

        int i = 0;
        int maxFruit = 0;
        HashMap<Integer ,Integer> map = new HashMap<>();

        for(int j = 0 ; j < fruits.length ; j++)
        {
            
            map.put(fruits[j] , map.getOrDefault(fruits[j], 0) + 1 );

            while( map.size() > 2)
            {
                map.put (fruits[i] , map.get(fruits[i]) - 1 );

                if( map.get(fruits[i]) == 0 )
                    map.remove(fruits[i]);

                i++;
            }
            
            maxFruit = Math.max(maxFruit , j-i +1);

        }
        return maxFruit;
        
    }
}