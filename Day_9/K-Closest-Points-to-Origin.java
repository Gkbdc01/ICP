            p.dist = points[i][0]*points[i][0] + points[i][1]*points[i][1];
        }
            pq.add(p);
        for(int i = 0;i<k;i++){
            int idx = pq.poll().idx;
        }
    }
            arr[i][0] = points[idx][0];
            arr[i][1] = points[idx][1];
        return arr;
    class pair{
        int idx;
            p.idx = i;
            pair p = new pair();
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> a.dist - b.dist);
        int[][] arr = new int[k][2];
        for(int i = 0;i<points.length;i++){
    public int[][] kClosest(int[][] points, int k) {
class Solution {