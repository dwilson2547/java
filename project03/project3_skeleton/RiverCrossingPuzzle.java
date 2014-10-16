/**
 * CS 180 - Project 03 - RiverCrossingPuzzle
 * 
 * (Brief description of the class file)
 * 
 * @author (Your Name) <(YourEmail@purdue.edu)>
 * 
 * @lab (Your lab section)
 *
 * @date (Today's date)
 */

public class RiverCrossingPuzzle {

   /**
     *  ***DO NOT CHANGE THIS FUNCTION.***
     * @return String containing the prompt for user input
     */
    public String prompt() {
        String str = "";
        str += "Available Actions\n";
        str += availableActions();
        str += "Action: ";
        return str;
    }
 
    /**
     * ***DO NOT CHANGE THIS FUNCTION.***
     * @return state of left (starting) bank as a String
     */
    private String leftBank() {
        String str = "";
        for (int i = 0; i < numCannibalsOnLeftBank(); i++)
            str += "C";
        str += " ";
        for (int i = 0; i < numMissionariesOnLeftBank(); i++)
            str += "M";
        str += " ";
        if (boatOnLeftBank())
            str += "B";
        return str;
    }
 
    /**
     *  ***DO NOT CHANGE THIS FUNCTION.***
     * @return state of right (ending) bank as a String
     */
    private String rightBank() {
        String str = "";
        if (boatOnRightBank())
            str += "B ";
        for (int i = 0; i < numCannibalsOnRightBank(); i++)
            str += "C";
        str += " ";
        for (int i = 0; i < numMissionariesOnRightBank(); i++)
            str += "M";
        return str;
    }
 
    public String toString() {
        return leftBank() + " | " + rightBank();
    }
 
    /**
     *  ***DO NOT CHANGE THIS FUNCTION.***
     * @return String representation of current state of puzzle
     */
    private String puzzleState() {
        String lb = leftBank();
        String rb = rightBank();
        String str = "\n";
        str += "Left Bank";
        for (int i = 9; i < lb.length(); i++)
            str += " ";
        str += " | ";
        for (int i = lb.length() + 3; i < lb.length() + rb.length() + 3 - 10; i++)
            str += " ";
        str += "Right Bank";
        str += "\n";
        str += lb;
        for (int i = lb.length(); i < 9; i++)
            str += " ";
        str += " | ";
        for (int i = rb.length() - 10; i < 0; i++)
            str += " ";
        str += rb;
        str += "\n";
        str += "\n";
        str += "   Cannibals on left,right banks: ";
        str += String.format("%3d,%3d", numCannibalsOnLeftBank(), numCannibalsOnRightBank());
        str += "\n";
        str += "Missionaries on left,right banks: ";
        str += String.format("%3d,%3d", numMissionariesOnLeftBank(), numMissionariesOnRightBank());
        str += "\n";
        str += "\n";
        str += "Number of moves: " + totalMoves();
        str += "\n";
        return str;
    }
}