package com.soumik.DS.soumik.DS;

public class sudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
                };

        /*
        [["5","3",".",".","7",".",".",".","."],
        ["6",".",".","1","9","5",".",".","."],
        [".","9","8",".",".",".",".","6","."],
        ["8",".",".",".","6",".",".",".","3"],
        ["4",".",".","8",".","3",".",".","1"],
        ["7",".",".",".","2",".",".",".","6"],
        [".","6",".",".",".",".","2","8","."],
        [".",".",".","4","1","9",".",".","5"],
        [".",".",".",".","8",".",".","7","9"]]
        */
        solveSudoku(board);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    public static void solveSudoku(char[][] board) {
        solve(board,0,0);

    }
    public static void solve(char[][] board, int i, int j){
        if(i == board.length){
            return;
        }
        int ni=0, nj=0;
        if(j == board[0].length - 1){
            ni = i+1;
            nj = 0;
        }else{
            ni = i;
            nj = j+1;
        }
        if(board[i][j] != '.'){
            solve(board,ni,nj);
        }else{
            for(char val='1'; val<='9'; val++){
                if(isSafe(board, i, j, val)){
                    board[i][j] = val;
                    solve(board, ni, nj);
                    board[i][j] = '.';
                }
            }
        }
    }

    public static boolean isSafe(char board[][], int x, int y, char val){
        for(int i=0; i<board[0].length; i++){
            if(board[x][i] == val){
                return false;
            }
        }

        for(int i=0; i<board.length; i++){
            if(board[i][y] == val){
                return false;
            }
        }

        int smi = x/3 * 3;
        int smj = y/3 * 3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[smi+i][smj+j] == val){
                    return false;
                }
            }
        }

        return true;
    }
}
