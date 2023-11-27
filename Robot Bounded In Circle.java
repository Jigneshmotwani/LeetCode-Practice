class Solution {
    public boolean isRobotBounded(String instructions) {
        char facing = 'N';
        int x = 0;
        int y = 0;
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < instructions.length(); i++) {
                char c = instructions.charAt(i);
                if (c == 'G' && facing == 'N') {
                    x += 1;
                } else if (c == 'G' && facing == 'S') {
                    x -= 1;
                } else if (c == 'G' && facing == 'E') {
                    y += 1;
                } else if (c == 'G' && facing == 'W') {
                    y -= 1;
                } else if (c == 'L' && facing == 'N') {
                    facing = 'W';
                } else if (c == 'L' && facing == 'S') {
                    facing = 'E';
                } else if (c == 'L' && facing == 'E') {
                    facing = 'N';
                } else if (c == 'L' && facing == 'W') {
                    facing = 'S';
                } else if (c == 'R' && facing == 'N') {
                    facing = 'E';
                } else if (c == 'R' && facing == 'S') {
                    facing = 'W';
                } else if (c == 'R' && facing == 'E') {
                    facing = 'S';
                } else {
                    facing = 'N';
                }
            }
            if (x == 0 && y == 0 && facing == 'N') {
                return true;
            }
        }
        return false;
    }
}