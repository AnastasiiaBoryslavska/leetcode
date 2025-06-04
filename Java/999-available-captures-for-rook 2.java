/**
On an 8 x 8 chessboard, there is exactly one white rook 'R' and some number of white bishops 'B', black pawns 'p', and empty squares '.'.

When the rook moves, it chooses one of four cardinal directions (north, east, south, or west), then moves in that direction until it chooses to stop, reaches the edge of the board, captures a black pawn, or is blocked by a white bishop. A rook is considered attacking a pawn if the rook can capture the pawn on the rook's turn. The number of available captures for the white rook is the number of pawns that the rook is attacking.

Return the number of available captures for the white rook. 
*/

class Solution {
    public int numRookCaptures(char[][] board) {
    int x0 = 0, y0 = 0, res = 0;
    for (int i = 0; i < 8; ++i)
        for (int j = 0; j < 8; ++j)
            if (board[i][j] == 'R') {
                x0 = i;
                y0 = j;
            }

    for (int[] d : new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}) {
        for (int x = x0 + d[0], y = y0 + d[1]; 0 <= x && x < 8 && 0 <= y && y < 8; x += d[0], y += d[1]) {
            if (board[x][y] == 'p') res++;
            if (board[x][y] != '.') break;
        }
    }
    return res;
}
}
