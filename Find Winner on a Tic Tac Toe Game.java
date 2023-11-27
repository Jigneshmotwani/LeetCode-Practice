class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        char player = 'A';
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            board[row][col] = player;
            if (player == 'A') {
                player = 'B';
            } else {
                player = 'A';
            }
        }
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
                return String.valueOf(board[i][0]);
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0) {
                return String.valueOf(board[0][i]);
            }
        }
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
            return String.valueOf(board[0][0]);
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) {
            return String.valueOf(board[0][2]);
        }
        // Check if game is pending or draw
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return "Pending";
                }
            }
        }
        return "Draw";
    }
}