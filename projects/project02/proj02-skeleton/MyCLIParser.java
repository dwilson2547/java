import java.util.Scanner; 

public class MyCLIParser {
    public static void main(String[] args) {
        // if no arguments, print help and return
        if (args.length == 0) {
            help(args);
            return;
        }
        //-help
        else if (args[0].equals("-help"))  help(args);
        //-add
        else if (args[0].equals("-add"))   add(args);
        //-sub
        else if (args[0].equals("-sub"))   sub(args);
        //-mul
        else if (args[0].equals("-mul"))   mul(args);
        //-div
        else if (args[0].equals("-div"))   div(args);
        //-stats
        else if (args[0].equals("-stats")) stats(args);
        //-table
        else if (args[0].equals("-table")) table(args);
    }

    public static boolean isInteger(String s) {
        // CODE HERE 
        int a; 
        
        try {
            a = Integer.parseInt(s);
            return true; 
        }
        catch (NumberFormatException e) {
            return false;  
        }
    }

    private static void help(String[] args) {
        // CODE HERE
        System.out.println("====================================================================="); 
        System.out.println("_____COMMAND_________________________________FUNCTION________________");
        System.out.println("====================================================================="); 
        System.out.println("  add (a) (b) (c)                  Adds all integers that are listed,");
        System.out.println("                                   separated by space character      ");
        System.out.println("  sub (a) (b)                      Takes two integers and subtracts  ");
        System.out.println("                                   them                              "); 
        System.out.println("  mul (a) (b) (c)                  Takes one or more integer and     "); 
        System.out.println("                                   returns the product of all values "); 
        System.out.println("  div (a) (b)                      Takes two integers and divides    "); 
        System.out.println("                                   them                              ");
        System.out.println("  stats (a) (b) (c)                Takes one or more integers and    "); 
        System.out.println("                                   returns the sum, max value, min   "); 
        System.out.println("                                   value, and average of all numbers ");
        System.out.println("  table (a)                        Takes one integer and returns a   ");
        System.out.println("                                   multiplication table for that     ");
        System.out.println("                                   number                            ");
        System.out.println("====================================================================="); 
        System.out.println("====================================================================="); 
    }

    private static void add(String[] args) {
        // CODE HERE
        if (args.length == 1) {
            System.out.println("Argument count mismatch"); 
            return; 
        }
        for (int i = 1; i < args.length; i++) {
            if (isInteger(args[i]) == false) {
                System.out.println("Argument type mismatch");
                return; 
            }
        }
        int sum = 0; 
        for (int i = 1; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]); 
        }
        System.out.println(sum); 
    }

    private static void sub(String[] args) {
        // CODE HERE
        if (args.length != 3) {
            System.out.println("Argument count mismatch"); 
            return; 
        }
        if (isInteger(args[1]) == false || isInteger(args[2]) == false) {
            System.out.println("Argument type mismatch");
            return; 
        }
        int sum = 0; 
        sum = Integer.parseInt(args[1]) - Integer.parseInt(args[2]); 
        System.out.println(sum); 
    }

    private static void mul(String[] args) {
        // CODE HERE
        if (args.length == 1) {
            System.out.println("Argument count mismatch"); 
            return; 
        }
        for (int i = 1; i < args.length; i++) {
            if (isInteger(args[i]) == false) {
                System.out.println("Argument type mismatch");
                return; 
            }
        }
        int sum = 1; 
        for (int i = 1; i < args.length; i++) {
            sum = sum * Integer.parseInt(args[i]); 
        }
        System.out.println(sum); 
    }

    private static void div(String[] args) {
        // CODE HERE
        if (args.length != 3) {
            System.out.println("Argument count mismatch"); 
            return; 
        }
        if (isInteger(args[1]) == false || isInteger(args[2]) == false) {
            System.out.println("Argument type mismatch");
            return; 
        }
        if (Integer.parseInt(args[2]) == 0) {
            System.out.println("undefined");
            return; 
        }
        double sum = 0.0; 
        sum = (double)Integer.parseInt(args[1]) / (double)Integer.parseInt(args[2]); 
        System.out.printf("%.2f\n", sum); 
    }

    private static void stats(String[] args) {
        // CODE HERE
        if (args.length == 1) {
            System.out.println("Argument count mismatch"); 
            return; 
        }
        for (int i = 1; i < args.length; i++) {
            if (isInteger(args[i]) == false) {
                System.out.println("Argument type mismatch");
                return; 
            }
        }
        int sum = 0; 
        int max = 0; 
        int min = 0; 
        for (int i = 1; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]); 
            if (i == 1) {
                max = Integer.parseInt(args[1]);
                min = Integer.parseInt(args[1]);
            }
            else {
                if (max < Integer.parseInt(args[i])) {
                    max = Integer.parseInt(args[i]); 
                }
                if (min > Integer.parseInt(args[i])) {
                    min = Integer.parseInt(args[i]); 
                }
            }
        }
        double avg = (double)sum / (double)(args.length - 1); 
        System.out.println(sum); 
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f\n", avg); 
    }

    private static void table(String[] args) {
        // CODE HERE
        if (args.length != 2) {
            System.out.println("Argument count mismatch");
            return; 
        }
        if (isInteger(args[1]) == false) {
            System.out.println("Argument type mismatch");
            return; 
        }
        int[][] table = new int[10][10]; 
        for (int rows = 0; rows < 10; rows++) {
            for (int columns = 0; columns < 10; columns++) {
                table[rows][columns] = (columns * rows) + Integer.parseInt(args[1]); 
                System.out.format("%6d", table[rows][columns]);
            }
            System.out.println();
        }
    }
}
