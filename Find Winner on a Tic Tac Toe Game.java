import java.util.HashMap;

class Solution {
    public String tictactoe(int[][] moves) {
        int i = 0;
        int[][] playerA = new int[(int) (moves.length+1/2)][2];
        int[][] playerB = new int[moves.length/2][2];
        while(i<moves.length){
            playerA[i] = moves[i];
            i++;
            playerB[(int) i/2] = moves[i];
            i++;
        }
        
        return "";
    }
    public boolean winorlose(int[][] tmoves){
        
    }
}
