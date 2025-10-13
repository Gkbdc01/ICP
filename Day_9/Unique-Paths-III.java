            return 0;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1)
    public int dfs(int[][] grid, int i, int j, int empty) {
    }

        return dfs(grid, startX, startY, empty);
            }
        }
        
                }
                else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                if (grid[i][j] == 0) empty++;
            for (int j = 0; j < grid[0].length; j++) {
        for (int i = 0; i < grid.length; i++) {
        
        int empty = 0, startX = 0, startY = 0;
    public int uniquePathsIII(int[][] grid) {
class Solution {