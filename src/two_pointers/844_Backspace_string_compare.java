/**
 * Problem: 844. Backspace String Compare
 * Approach: Reverse Two Pointers
 * Time Complexity: O(N + M) - Where N and M are the lengths of strings s and t.
 * Space Complexity: O(1) - Strings are evaluated backwards without using a Stack.
 */

package two_pointers;

class Solution_844{
    public boolean backspaceCompare(String s, String t) {

        int pointer1 = s.length() - 1;
        int pointer2 = t.length() - 1;

        int skip1 = 0;
        int skip2 = 0;

        while(pointer1 >= 0 || pointer2 >= 0){


            //for s String character
            while(pointer1 >=0)
            {
                if(s.charAt(pointer1) == '#'){
                    skip1++;
                    pointer1--;
                    continue;
                }
                else {
                    if(s.charAt(pointer1) != '#'){
                        if(skip1 > 0)
                        {
                            pointer1--;
                            skip1--;
                        }
                        else{
                            break;
                        }
                    }

                }

            }
            //for t String character
            while(pointer2 >=0)
            {
                if(t.charAt(pointer2) == '#'){
                    skip2++;
                    pointer2--;
                    continue;
                }
                else {
                    if(t.charAt(pointer2) != '#'){
                        if(skip2 > 0)
                        {
                            pointer2--;
                            skip2--;
                        }
                        else{
                            break;
                        }
                    }

                }

            }

            if(pointer1 < 0 && pointer2 <0)
            {
                return true;
            }

            if(pointer1 < 0 || pointer2 <0)
            {
                return false;
            }


            if(s.charAt(pointer1) == t.charAt(pointer2))
            {
                pointer1--;
                pointer2--;
                continue;
            }
            if(s.charAt(pointer1) != t.charAt(pointer2))
            {
                return false;
            }
        }

    return true;

    }
}