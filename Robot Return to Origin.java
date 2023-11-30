class Solution {
    public boolean judgeCircle(String moves) {
        int startx = 0;
        int starty = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                starty += 1;
            } else if (moves.charAt(i) == 'D') {
                starty -= 1;
            } else if (moves.charAt(i) == 'L') {
                startx += 1;
            } else if (moves.charAt(i) == 'R') {
                startx -= 1;
            }

        }
        if (startx == 0 && starty == 0) {
            return true;
        }
        ;
        return false;

    }
}