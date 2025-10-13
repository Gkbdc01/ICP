        }

        int temp = grid[i][j];
        grid[i][j] = -1; // mark visited

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

            return;
            if (empty == 0) result++;
        if (grid[i][j] == 2) {
        for (int d = 0; d < 4; d++) {
            dfs(grid, i + dx[d], j + dy[d], temp == 0 ? empty - 1 : empty);
        // Reached the end

            return;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1)
        // Out of bounds or obstacle
    private void dfs(int[][] grid, int i, int j, int empty) {
