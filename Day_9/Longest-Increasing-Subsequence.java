        return LIS(nums);
    }
    public static int LIS(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);
        for(int i = 0;i<arr.length;i++) {
                if(arr[i]>arr[j]) {
                    dp[i] = Math.max(dp[i], x+1);
        }
                    int x = dp[j];
    public int lengthOfLIS(int[] nums) {
class Solution {
                }
            }
            for(int j = i -1 ; j>=0;j--) {
        return Arrays.stream(dp).max().getAsInt();
    }
}