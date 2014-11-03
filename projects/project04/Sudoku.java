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
 
// Sudoku class 
public class Sudoku {
    
    public int[][] board; 
        
    public Sudoku() {
        // creates a Sudoku with an initially empty board
        this.board = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }
    public Sudoku(int[][] array) {
        // creates a Sudoku with an initial board defined by the 
        //two dimensional array board, where board[r][c] represents 
        //the value stored in the cell at the intersection 
        //of row r and column c. value 0 represents an empty cell
        int[][] copy = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                copy[i][j] = array[i][j];
            }
        }
        this.board = copy;
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
                if (array[i][j] == 0) {
                    cell_Symbol = ' '; 
                }
                else {
                    cell_Symbol = (char)(array[i][j] + 48);  
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
        int[][] boardCopy = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boardCopy[i][j] = board[i][j];
            }
        }
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
                if (board[i][j] == '0');
                    return false;
            }
        }
        return true; 
    } 
    public void solve() {
        // attempts to solve the board. exits when board is solved or 
        // no updates were made to the board
        while ((!isSolved()) && (nakedSingles() || hiddenSingles())) {
            // loop continues to search for hidden and naked singles 
            // stops execution when puzzle is solved or there are no
            // more hidden singles or naked singles
        }
        printBoard(board); 
    }
    public boolean nakedSingles() {
        boolean[] values = new boolean[9]; 
        int ctr = 0; 
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                values = candidates(r, c); 
                ctr = 0; 
                for (int i = 0; i < 9; i++) {
                    if (values[i] = true) {
                        ctr++; 
                    }
                }
                if (ctr ==1) {
                    for (int j = 0; j < 9; j++) {
                        if (values[j] == true) {
                            board[r][c] = (j + 1); 
                            return true; 
                        }
                    }
                }
            }
        }
        return false; 
    }
    public boolean hiddenSingles() {
        return (hSRows() || hSColumns() || hSBlock());  
    }
    public boolean hSRows() {
        boolean[][] values = new boolean[9][9];
        boolean[] r = new boolean[9]; 
        boolean[] num = new boolean[9]; 
        
        for (int i = 0; i < 9; i++) {
            r[i] = false; 
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                num = candidates(i, j); 
                for (int k = 0; k < 9; k++) {
                    values[j][k] = num[k]; 
                }
            }
            for (int j = 0; i < 9; i++) {
                int ctr = 0; 
                for (int k = 0; k < 9; k++) {
                    if (values[k][j] == true) {
                        ctr++; 
                        r[k] = true; 
                    }
                }
                if (ctr == 1) {
                    for (int k = 0; k < 9; k++) {
                        if (values[k][j] == true) {
                            board[i][k] = j + 1;  
                            return true; 
                        }
                    }
                }
            }
        }
        return false; 
    }
    public boolean hSColumns() {
        boolean[][] values = new boolean[9][9];
        boolean[] c = {false, false, false, false, false, false, false, false, false}; 
        //represents which cells are filled. False if cell is not a possible [1].
        boolean[] num = new boolean[9];
        
        for (int coll = 0; coll < 9; coll++) {            
            for (int row = 0; row < 9; row++) {
                num = candidates(row, coll);        
                for (int a = 0; a < 9; a++) {
                    values[row][a] = num[a];
                }
            }
            for (int i = 0; i < 9; i++) {
                int counter = 0;
                for (int j = 0; j < 9; j++) {
                    if (values[j][i]) {
                        counter++; //increments each time the cell is a possible candidate
                        c[j] = true;
                    }
                }
                if (counter == 1) {
                    for (int k = 0; k < 9; k++) {
                        if (values[k][i]) {
                            board[k][coll] = i + 1;
                            return true;
                        }
                    }
                }
            }
            
        }
        
        return false; 
    }
    public boolean hSBlock() {
        boolean[][] values = new boolean[9][9];
        boolean[] block = {false, false, false, false, false, false, false, false, false}; 
        //represents which cells are filled. False if cell is not a possible [1].
        boolean[] num = new boolean[9];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int ctr = 0;
                for (int f = 0; f < 3; f++) {
                    for (int g = 0; g < 3; g++) {
                        num = candidates(3 * i + f, 3 * j + g);
                        
                        for (int h = 0; h < 9; h++) {
                            values[ctr][h]  = num[h];
                        }
                        ctr++;
                    }
                }
                for (int k = 0; k < 9; k++) {
                    int ctr2 = 0;
                    for (int b = 0; b < 9; b++) {
                        if (values[b][k]) {
                            ctr2++; //increments each time the cell is a possible candidate
                            block[b] = true;
                        }
                    }
                    if (ctr2 == 1) {
                        for (int c = 0; c < 9; c++) {
                            if (values[c][k]) {
                                board[3 * i + c / 3][3 * j + c % 3] = k + 1;
                                return true;
                            }
                        }
                    }
                }
            }
        }            
        return false;
    }
    public void initializeArray(String s) {
        int index = 0; 
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) { 
                board[i][j] = s.charAt(index) - 48; 
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
        
        a.solve(); 
        
    }
}