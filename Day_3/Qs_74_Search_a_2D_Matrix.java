class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(target>matrix[n-1][m-1] || target<matrix[0][0]){
            return false;
        }
        int r = row(matrix,target);
        int[] chr = matrix[r];
        int lo = 0;
        int hi = chr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(chr[mid] == target){
                return true;
            }
                else if(chr[mid]<target){
                    lo = mid+1;
                }
            else{
                hi = mid -1;
            }
        }
        return false;
    }
    public static int row(int[][] matrix,int target){
        int lo = 0;
        int hi = matrix.length-1;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(matrix[mid][0] <= target){
                ans = mid;
                lo = mid+1;
            }
            else{
                hi = mid -1;
            }
        }
        return ans;
    }
}