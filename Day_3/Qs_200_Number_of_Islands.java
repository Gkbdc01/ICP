class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numRows = grid.length;
        int numCols = grid[0].length;
        int islandCount = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == '1') {
                    islandCount++; 
                    bfs(i, j, grid, numRows, numCols);
                }
            }
        }
        return islandCount;
    }
    public void bfs(int startRow, int startCol, char[][] grid, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startRow, startCol});
        grid[startRow][startCol] = '0';
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == '1') {
                    grid[newRow][newCol] = '0';
                    queue.add(new int[]{newRow, newCol}); 
                }
            }
        }
    }
}