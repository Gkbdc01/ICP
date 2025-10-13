        return LIS(nums,0,Integer.MIN_VALUE);
    }
    public static int LIS(int[] arr,int i ,int lst) {
        if(i == arr.length){
            return 0;
        }
        if(lst<arr[i]){
        }
    }
            pick =  1+LIS(arr,i+1,arr[i]);
        int ntpick = LIS(arr,i+1,lst);
        return Math.max(pick,ntpick);
        int pick = 0;
}
    public int lengthOfLIS(int[] nums) {
class Solution {