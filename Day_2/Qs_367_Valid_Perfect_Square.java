class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        return sqrt(num);
    }

    public static boolean sqrt(int n) {
        int lo = 1; 
        int hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid == n / mid && n % mid == 0) {
                return true;
            } else if (mid < n / mid) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}