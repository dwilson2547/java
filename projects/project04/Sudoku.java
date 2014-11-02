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
            values[i] = true; 
        }
        // search rows
        for (int i = 0; i < 9; i++) {
            int index = board[i][column];
            if (index != 0) {
                values[board[i][column] - 1] = false; 
            }
        } 
        // search columns
        for (int i = 0; i < 9; i++) {
            int index = board[row][i]; 
            if (index != 0) {
                values[board[row][i] - 1] = false; 
            }
        }
        // search box
        
        int r = (row - (row % 3)); 
        int c = (column - (column % 3)); 

        for (int i = r; i < (r + 3); i++) {
            for (int j = c; j < (c + 3); j++) {
		if (board[j][i] != 0) {
                    values[board[j][i] - 1] = false; 
                }
            }
        }
        return  values; 
    }
    public boolean isSolved() {
        // returns true if the board is in a solved state 
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0)
                    return false;
            }
        }
        return true; 
    }
    //To construct a board from this string (which might be provided as a command line argument to main, or via standard input) is simply a 
    public void solve() {
        // attempts to solve the board. exits when board is solved or 
        // no updates were made to the board
        while ((!isSolved()) && (nakedSingles() || hiddenSingles())) {
            // loop continues to search for hidden and naked singles 
            // stops execution when puzzle is solved or there are no
            // more hidden singles or naked singles
        }
    }
    public boolean nakedSingles() {
        return false; 
    }
    public boolean hiddenSingles() {
        return false; 
    }
    public void initializeArray(String s) {
        int index = 0; 
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = s.charAt(index); 
                index++; 
            }
        }
    }
    // main method
    public static void main(String[] args) {
        // get input from user 
        Sudoku a = new Sudoku(); 
        
        if (args.length != 0) {
            if (args.length == 1) {
                if (args[0].length() == 81) {
                    a.initializeArray(args[0]); 
                }
                else {
                    System.out.println("Please enter a 81 digits"); 
                    return; 
                }
            }
            else {
                System.out.println("Invalid Input"); 
                return;
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
                a.initializeArray(inputLine);
            }
            catch (Exception ex) {
                System.out.println(ex.toString()); 
                return; 
            }
        }
        // call methods here 
        
        a.printBoard(a.board); 
        
    }
}

