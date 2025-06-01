var countBattleships = function(board) {
    let numBattleships = 0;
    for( let i= 0; i < board.length; i++) {
        for( let j = 0; j < board[i].length; j++) {
            if(board[i][j] == 'X' 
               && board[i][j - 1] !== 'X'
               && (!board[i - 1] || board[i - 1][j] !=='X') ) numBattleships++; 
            // if(i > 0 && board[i - 1][j] == 'X') {
            //     continue;
            // }
            // if(j > 0 && board[i][j - 1] == 'X'){
            //     continue;
            // }
        }
    }   
    return numBattleships;
};

//second variant
//         function sink(board, i, j ) {
    //         if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != 'X') {
    //             return;
    //         }
            
    //         board[i][j] = '.';
    //         sink(board, i + 1, j);
    //         sink(board, i - 1, j);
    //         sink(board, i, j + 1);
    //         sink(board, i, j - 1);
    //     }