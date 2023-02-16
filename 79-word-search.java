/*
  Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
*/

class Solution {
    public boolean exist(char[][] board, String word) {
         /*Find word's first letter.  Then call method to check it's surroundings */
         for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
                if(board[r][c] == word.charAt(0) && helper(board, word, 0, r, c)) {
                    return true;
                }
            }          
         }
         return false;
    }

    public boolean helper(char[][] board, String word, int start, int r, int c) {
        /* once we get past word.length, we are done. */
        if(word.length() <= start) {
            return true;
        }

        /* if off bounds, letter is seen, letter is unequal to word.charAt(start) return false */
        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] == '0' || board[r][c] != word.charAt(start)) {
            return false;
        }

        /* set this board position to seen. (Because we can use this postion) */
        char tmp = board[r][c];
        board[r][c] = '0';

        /* recursion on all 4 sides for next letter, if works: return true */
        if( helper(board, word, start + 1, r + 1, c) ||
            helper(board, word, start + 1, r - 1, c) ||
            helper(board, word, start + 1, r, c + 1) ||
            helper(board, word, start + 1, r, c - 1)) {
                return true;
        }

        //Set back to unseen
        board[r][c] = tmp;

        return false;
    }    
}
