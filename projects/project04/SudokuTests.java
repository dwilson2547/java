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
        
    }
    public void testCandidates() {
        
    }
    public void testIsSolved() {
        
    }
    public void testNakedSingles() {
        
    }
    public void testHiddenSingles() {
        
    }
    public void testSolve() {
        
    }
}
