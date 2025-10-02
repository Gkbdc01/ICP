class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> a[1]-b[1]);
        int max = 0;
        int[] st = intervals[0];
        for(int i = 1; i < intervals.length;i++){
            if(st[1]>intervals[i][0]){
                max++;
            }else{
                st = intervals[i];
            }
        }
        return max;
    }
}