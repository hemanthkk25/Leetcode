class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcnt = 0;
        int curcnt = 0;
        for (int i = 0; i < nums.length; i++){
            
            if (nums[i] == 1){
                curcnt++;
            }

            else {
                curcnt=0;
                
            }
            if (curcnt > maxcnt){
                    maxcnt = curcnt;

                }

        }
        return maxcnt;

    }
}