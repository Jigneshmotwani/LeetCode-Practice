import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    result[i][j] = 0;
                } else if(mat[i][j] == 1) {
                    bfs(mat, i, j, result);;
                }
            }
        }
        return result;
    }


    void bfs(int[][] mat, int i, int j, int[][] result) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { i, j });
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            if (result[x][y] == 0 || result[x][y] > result[i][j] + 1) {
                result[x][y] = result[i][j] + 1;
                if (x > 0) {
                    queue.offer(new int[] { x - 1, y });
                }
                if (x < mat.length - 1) {
                    queue.offer(new int[] { x + 1, y });
                }
                if (y > 0) {
                    queue.offer(new int[] { x, y - 1 });
                }
                if (y < mat[0].length - 1) {
                    queue.offer(new int[] { x, y + 1 });
                }
            }
        }
    } 
}