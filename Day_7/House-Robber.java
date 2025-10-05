class Solution {
    public int rob(int[] nums) {
        return robberbu(nums,0);
    }
    public static int robberbu(int[] arr,int i) {
        if(arr.length == 1) {
            return arr[0];
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for(int j = 2;j<dp.length;j++) {
            int rob = arr[j] + dp[j-2];
            int dontrb = dp[j-1];
            dp[j] = Math.max(rob,dontrb);
        }
        return dp[dp.length-1];
    }
}