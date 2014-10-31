/* 
 * Sudoku 
 * 
 * program solves sudoku puzzles
 * 
 * @author Daniel Wilson <wilso509@purdue.edu>
 * @author Matt Stahl <stahl9@purdue.edu>
 * 
 * @lab LN5
 * 
 * @date October 30, 2014
 * 
 */ 

// imports
import java.util.Scanner; 
import java.util.ArrayList; 
// Sudoku class 
public class Sudoku {
    
    public int[][] board; 
    ArrayList<Integer> pv = new ArrayList<Integer>() ; 
        
    public Sudoku() {
        // creates a Sudoku with an initially empty board
        board = new int[9][9];
        for (int i = 1; i < 10; i++) {
            pv.add(i); 
        }
    }
    public Sudoku(int[][] array) {
        // creates a Sudoku with an initial board defined by the 
        //two dimensional array board, where board[r][c] represents 
        //the value stored in the cell at the intersection 
        //of row r and column c. value 0 represents an empty cell
        board = array; 
    }
    // print board method
    public void printBoard(int[][] array) {
        System.out.println("    1 2 3   4 5 6   7 8 9");
        System.out.println("  +-------+-------+-------+"); 
        char row_Letter = 'A'; 
        for (int i = 0; i < 9; i++) {
            if (i > 0 && i % 3 == 0) {
                System.out.println("  +-------+-------+-------+"); 
            }
            System.out.print(row_Letter + " |");
            for (int j = 0; j < 9; j++) {
                char cell_Symbol; 
                if (array[i][j] == '0') {
                    cell_Symbol = ' '; 
                }
                else {
                    cell_Symbol = (char)array[i][j];  
                }
                if (j > 0 && j % 3 == 0 && j != 8) {
                    System.out.print(" | " + cell_Symbol);
                }
                else if (j == 8) {
                    System.out.print(" " + cell_Symbol + " |"); 
                }
                else {
                    System.out.print(" " + cell_Symbol); 
                }
            }
            System.out.println(); 
            if (i == 8) {
                System.out.println("  +-------+-------+-------+"); 
            }
            row_Letter++; 
        }
    }
    
    public int[][] board() {
        // returns a copy of the current state of the board
        int[][] boardCopy = board; 
        return boardCopy; 
    }
    public boolean[] candidates(int row, int column) {
        // returns the list of candidates for the specified cell
        // array contains true at index a if a is a candidate for 
        // the cell at row and column, so long as the cell is not 
        // already set (non zero), in which case there are no candidates
        boolean[] values = new boolean[9]; 
        for (int i = 0; i < 9; i++) {
            values[i] = false; 
        }
        // search rows
        for (int i = 0; i < 9; i++) {
            int index = board[i][column + 1];
            if (index != 0 && pv.contains(index) == false) {
                values[i] = true; 
            }
        } 
        // search columns
        for (int i = 0; i < 9; i++) {
            int index = board[row + 1][i]; 
            if (index != 0 && pv.contains(index) == false) {
                values[i] = true; 
            }
        }
        // search box
        if (row > 0 && row < 4) {
            if (column > 0 && column < 4) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int index = board[i][j]; 
                        if (index != 0 && pv.contains(index) == false) {
                            values[index - 1] = true; 
                        }
                    }
                }
            }
            else if (column > 3 && column < 7) {
                // FIX NUMBERS 
                for (int i = 3; i < 6; i++) {
                    for (int j = 3; j < 3; j++) {
                        int index = board[i][j]; 
                        if (index != 0 && pv.contains(index) == false) {
                            values[index - 1] = true; 
                        }
                    }
                }
            }
            else {
                // FIX NUMBERS 
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int index = board[i][j]; 
                        if (index != 0 && pv.contains(index) == false) {
                            values[index - 1] = true; 
                        }
                    }
                }
            }
        }
        else if (row > 3 && row < 7) {
            if (column > 0 && column < 4) {
                
            }
            else if (column > 3 && column < 7) {
                
            }
            else {
                
            }
        }
        else {
            if (column > 0 && column < 4) {
                
            }
            else if (column > 3 && column < 7) {
                
            }
            else {
                
            }
        }
        return  values; 
    }
    public boolean isSolved() {
        // returns true if the board is in a solved state 
        return false; 
    }
    //To construct a board from this string (which might be provided as a command line argument to main, or via standard input) is simply a 
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
    public void initializeArray(String s) {
        
    }
    // main method
    public static void main(String[] args) {
        // get input from user 
        Sudoku a = new Sudoku(); 
        
        if (args.length != 0) {
            if (args.length == 2) {
                if (args[2].length() == 81) {
                    a.initializeArray(args[2].toString()); 
                }
            }
        }
        else {
            Scanner s = new Scanner(System.in); 
            System.out.println("Please enter a Sudoku puzzle as an 81 digit string of numbers: "); 
            String inputLine = s.next(); 
            if (inputLine.length() != 81) {
                System.out.println("Please enter 81 digits"); 
                return; 
            }
            try {
                int index = 0; 
                
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        a.board[i][j] = inputLine.charAt(index); 
                        index++; 
                    }
                }
            }
            catch (Exception ex) {
                System.out.println(ex.toString()); 
            }
        }
        // call methods here 
        
        a.printBoard(a.board); 
        
    }
}