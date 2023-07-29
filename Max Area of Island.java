import java.util.LinkedList;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        LinkedList<Integer> areas = new LinkedList<Integer>();
        int[][] check = new int[grid.length][grid[0].length];

        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[i].length; j++) {
                check[i][j] = 0;
            }
        }

        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[i].length; j++) {
                if (check[i][j] == 0) {
                    if (grid[i][j] == 0) {
                        check[i][j] = 1;
                        continue;
                    } else {
                        int[] count = new int[1];
                        count[0] = 0;
                        reccursive(grid, check, i, j, count);
                        areas.add(count[0]);
                    }
                }
            }
        }
        int result = 0;

        for (int x = 0; x < areas.size(); x++) {
            if (areas.get(x) > result) {
                result = areas.get(x);
            }

        }
        return result;

    }

    void reccursive(int[][] grid, int[][] check, int i, int j, int count[]) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }
        if (check[i][j] == 0 && grid[i][j] == 1) {
            check[i][j] = 1;
            count[0] += 1;

            reccursive(grid, check, i + 1, j, count);
            reccursive(grid, check, i - 1, j, count);
            reccursive(grid, check, i, j + 1, count);
            reccursive(grid, check, i, j - 1, count);
        }
    }
}