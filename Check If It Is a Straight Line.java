class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x = coordinates[0][0];
        int y = coordinates[0][1];
        int m = coordinates[1][0];
        int n = coordinates[1][1];
        int dx = m - x;
        int dy = n - y;
        
        if (dx == 0) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != x) {
                    return false;
                }
            }
        } else {
            double a = (double) dy / dx;
            for (int i = 2; i < coordinates.length; i++) {
                int xi = coordinates[i][0];
                int yi = coordinates[i][1];
                if ((xi - x) * a != yi - y) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
