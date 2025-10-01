class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        int zcnt = 0;
        while(i<nums.length){
            if(nums[i] == 0){
                zcnt++;
            }
            if(zcnt>k){
                max = Math.max(i-j,max);
                while(zcnt>k){
                    if(nums[j] == 0){
                        zcnt--;
                    }
                    j++;
                }
            }
            i++;
        }
        max = Math.max(max,i-j);
        return max;
    }
}