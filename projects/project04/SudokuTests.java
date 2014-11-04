import junit.framework.TestCase;
import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class SudokuTests extends TestCase {
    ByteArrayOutputStream outContent;
    ByteArrayOutputStream errContent;

    /**
     * Prepare to capture command line output.
     */
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    /**
     * A test method.
     * (Replace "X" with a name describing the test.  You may write as
     * many "testSomething" methods in this class as you wish, and each
     * one will be called when running JUnit over this class.)
     */
    public void testPrintBoard() {
        int[][] a = new int[9][9]; 
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a[i][j] = 0; 
            }
        }
        Sudoku s = new Sudoku(a);
        s.printBoard(a); 
//        assertTrue(outContent.toString().matches
//                 ("    1 2 3   4 5 6   7 8 9\n" +
//                  "  +-------+-------+-------+\n" +
//                  "A |       |       |       |\n" +
//                  "B |       |       |       |\n" +
//                  "C |       |       |       |\n" +
//                  "  +-------+-------+-------+\n" +
//                  "D |       |       |       |\n" +
//                  "E |       |       |       |\n" +
//                  "F |       |       |       |\n" +
//                  "  +-------+-------+-------+\n" +
//                  "G |       |       |       |\n" +
//                  "H |       |       |       |\n" +
//                  "I |       |       |       |\n" +
//                  "  +-------+-------+-------+\n"));
    }   
    public void testBoard() {
        // make sure that board returned is not a reference for the original board
        int[][] a = new int[9][9]; 
        Sudoku b = new Sudoku(); 
        assertFalse(b.board() == a); 
    }
    public void testCandidates() {
        boolean[] a; 
        Sudoku b = new Sudoku(); 
        a = b.candidates(0, 0); 
        
    }
    public void testIsSolved() {
        Sudoku a = new Sudoku(); 
        assertEquals(a.isSolved(), false); 
        int[][] b = new int[9][9]; 
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                b[i][j] = 2; 
            }
        }
        Sudoku c = new Sudoku(b);
        assertEquals(c.isSolved(), false); 
    }
    public void testNakedSingles() {
        boolean a; 
        Sudoku b = new Sudoku(); 
        a = b.nakedSingles(); 
    }
    public void testHiddenSingles() {
        boolean a; 
        Sudoku b = new Sudoku(); 
        a = b.hiddenSingles(); 
    }
    public void testSolve() {
        // 009201007 000500109 040080600 704103000 030000000 052060070 000000000 260050800 008000045
        int[][] b = new int[][]  
           {{0, 0, 9, 2, 0, 1, 0, 0, 7}, 
            {0, 0, 0, 5, 0, 0, 1, 0, 9}, 
            {0, 4, 0, 0, 8, 0, 6, 0, 0}, 
            {7, 0, 4, 1, 0, 3, 0, 0, 0}, 
            {0, 3, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 5, 2, 0, 6, 0, 0, 7, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {2, 6, 0, 0, 5, 0, 8, 0, 0}, 
            {0, 0, 8, 0, 0, 0, 0, 4, 5}
        }; 
        Sudoku a = new Sudoku(b);
        a.solve(); 
    }
    public void testSudoku() {
        int[][] board = new int[][] {{0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        Sudoku a = new Sudoku(); 
    }
    public void testInitializeArray() {
        Sudoku a = new Sudoku(); 
        a.initializeArray("009201007000500109040080600704103000030000000052060070000000000260050800008000045"); 
        int[][] b = new int[][]
        {{0, 0, 9, 2, 0, 1, 0, 0, 7},
         {0, 0, 0, 5, 0, 0, 1, 0, 9},
         {0, 4, 0, 0, 8, 0, 6, 0, 0},
         {7, 0, 4, 1, 0, 3, 0, 0, 0},
         {0, 3, 0, 0, 0, 0, 0, 0, 0},
         {0, 5, 2, 0, 6, 0, 0, 7, 0},
         {0, 0, 0, 0, 0, 0, 0, 0, 0},
         {2, 6, 0, 0, 5, 0, 8, 0, 0},
         {0, 0, 8, 0, 0, 0, 0, 4, 5}}; 
        //assertEquals(a.board, b); 
    }
}
