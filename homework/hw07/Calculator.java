import java.util.Scanner;

public class Calculator {
    int sum(String s) {
        Scanner in = new Scanner(s); 
        int sum = 0; 
        while (in.hasNextInt() != false) {
            sum = sum + in.nextInt();
        }
        return sum; 
    }
    public static void main(String[] args) {
        // code goes here 
    }
}