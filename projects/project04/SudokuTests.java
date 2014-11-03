import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class SudokuTests extends TestCase {
    
    /**
     * A test method.
     * (Replace "X" with a name describing the test.  You may write as
     * many "testSomething" methods in this class as you wish, and each
     * one will be called when running JUnit over this class.)
     */
    public void testPrintBoard() {
        Sudoku s = new Sudoku();
        assertTrue
            (outContent.toString().matches
                 ("    1 2 3   4 5 6   7 8 9  \\r?\\n" +
                  "  +-------+-------+-------+\\r?\\n" +
                  "A |       |       |       |\\r?\\n" +
                  "B |       |       |       |\\r?\\n" +
                  "C |       |       |       |\\r?\\n" +
                  "  +-------+-------+-------+\\r?\\n" +
                  "D |       |       |       |\\r?\\n" +
                  "E |       |       |       |\\r?\\n" +
                  "F |       |       |       |\\r?\\n" +
                  "  +-------+-------+-------+\\r?\\n" +
                  "G |       |       |       |\\r?\\n" +
                  "H |       |       |       |\\r?\\n" +
                  "I |       |       |       |\\r?\\n" +
                  "  +-------+-------+-------+\\r?\\n"));
                  
                  
                  
                      
                      
                    
                      
    }
    
}
