import java.util.*;

class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        HashSet<String> set = new HashSet<>();
        set.add(x + "," + y);
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            }
            String key = x + "," + y;
            if (set.contains(key)) {
                return true;
            }
            set.add(key);
        }
        return false;
    }
}