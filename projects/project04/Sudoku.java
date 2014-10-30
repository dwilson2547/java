/* 
 * Sudoku 
 * 
 * program solves sudoku puzzles
 * 
 * @author Daniel Wilson <wilso509@purdue.edu>
 * 
 * @lab LN5
 * 
 * @date October 30, 2014
 * 
 */ 

// imports

// Sudoku class 
public class Sudoku {
    
    int[][] board; 
    
    public Sudoku() {
        // creates a Sudoku with an initially empty board
        board = new int[9][9];
    }
    public Sudoku(int[][] board) {
        // creates a Sudoku with an initial board defined by the 
        //two dimensional array board, where board[r][c] represents 
        //the value stored in the cell at the intersection 
        //of row r and column c. value 0 represents an empty cell
    }
    public int[][] board() {
        // returns a copy of the current state of the board
        return board; 
    }
    public boolean[] candidates(int row, int column) {
        // returns the list of candidates for the specified cell
        // array contains true at index a if a is a candidate for 
        // the cell at row and column, so long as the cell is not 
        // already set (non zero), in which case there are no candidates
        boolean[] a = new boolean[1]; 
        return a; 
    }
    public boolean isSolved() {
        // returns true if the board is in a solved state 
        return false; 
    }
    public void solve() {
        // attempts to solve the board. exits when board is solved or 
        // no updates were made to the board
    }
    public boolean nakedSingles() {
        return false; 
    }
    public boolean hiddenSingles() {
        return false; 
    }
}