/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
*/

var exist = function (board, word) {
  const row_num = board.length;
  const col_num = board[0].length;

  for (let r = 0; r < row_num; r++) {
    for (let c = 0; c < col_num; c++) {
      if (board[r][c] === word[0] && helper(r, c, 0)) {
        return true;
      }
    }
  }

  function helper(r, c, index) {
    if (word.length == index) return true;
    if (
      r >= row_num ||
      r < 0 ||
      c >= col_num ||
      c < 0 ||
      board[r][c] !== word[index]
    )
      return false;

    board[r][c] = "0";

    if (
      helper(r + 1, c, index + 1) ||
      helper(r - 1, c, index + 1) ||
      helper(r, c + 1, index + 1) ||
      helper(r, c - 1, index + 1)
    ) {
      return true;
    }
    board[r][c] = word[index];
  }
  return false;
};
