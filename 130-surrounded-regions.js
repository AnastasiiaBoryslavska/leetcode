/*
 Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

*/

var solve = function(board) {
    for (let r = 0; r < board.length; r++) {
        for (let c = 0; c < board[r].length; c++) {
            if (board[r][c] === "O" && isOnBorder(r, c)) {
                checkNeighbours(r, c);
            }
        }
    }

    function isOnBorder(r, c) {
        return r === 0 || r === board.length - 1 || c === 0 || c === board[r].length - 1;
    }

    function checkNeighbours(r, c) {
        if (isBeyondBoard(r, c) || board[r][c] !== "O") {
            return;
        }

        board[r][c] = "Visited";

        checkNeighbours(r + 1, c);
        checkNeighbours(r, c + 1);
        checkNeighbours(r - 1, c);
        checkNeighbours(r, c - 1);
    }

    function isBeyondBoard(r, c) {
        return r < 0 || r >= board.length || c < 0 || c >= board[r].length;
    }

    for (let r = 0; r < board.length; r++) {
        for (let c = 0; c < board[r].length; c++) {
            if (board[r][c] === "Visited") {
                board[r][c] = "O"
            } else {
                board[r][c] = "X"
            }
        }
    }
};
