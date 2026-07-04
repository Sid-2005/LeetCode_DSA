class Solution_643 {
    public double findMaxAverage(int[] nums, int k) {

        int pointer1 = 0;
        int pointer2 = k - 1;

        int Maxsum = 0;
        int WindowSum = 0;


        for (int i = 0 ; i <= pointer2 ; i++)
        {
            WindowSum = WindowSum + nums[i];
        }

        Maxsum = WindowSum;

        while (pointer2 < nums.length - 1)
        {

            WindowSum = WindowSum - nums[pointer1] + nums[pointer2+1];

            Maxsum = Math.max(Maxsum,WindowSum);

            pointer1++;
            pointer2 ++;
        }

        return (double) Maxsum/k ;
    }
}