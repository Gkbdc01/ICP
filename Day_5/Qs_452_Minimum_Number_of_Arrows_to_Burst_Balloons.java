class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int cnt = 1;
        int arpos = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > arpos) {
                cnt++;
                arpos = points[i][1];
            }
        }
        return cnt;
    }
}