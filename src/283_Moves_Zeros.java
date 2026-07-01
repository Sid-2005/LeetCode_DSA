class Solution_283 {
    public void moveZeroes(int[] nums) {

        int pos = 0 ;


        for (int i= 0; i < nums.length ;i++) {

            if(nums[i] != 0)
            {
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos++;
            }

        }


    }
}

/*
Brute Force approach

class Solution_283 {
    public void moveZeroes(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[s]=nums[i];
                s++;
            }
        }
        for(int i=s ; i<nums.length;i++){
            nums[i]=0;
        }

    }
}
*/

