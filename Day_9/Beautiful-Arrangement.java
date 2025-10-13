    }

    public void calculate(int N, int pos, boolean[] visited) {
        if (pos > N) {
            count++;
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
        calculate(N, 1, visited);
        return count;

    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1];

    int count = 0;
public class Solution {