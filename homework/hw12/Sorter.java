/**
 * 
 * Sorter
 * 
 * description
 * 
 * @author Daniel Wilson <wilso509@purdue.edu>
 * 
 * @lab LN5
 * 
 * @date September 27, 2014
 * 
 **/ 
import java.util.Arrays; 


public class Sorter {
    static double[] sortArray(double[] input) {
        double[] a = new double[input.length]; 
        a = java.util.Arrays.copyOf(input, input.length);
        java.util.Arrays.sort(a); 
        input = a; 
        return input; 
    }
    public static void main(String[] args) {
        double [] x = {42.0, 3.5, Math.PI, 12.2, -47}; 
        double [] y = sortArray(x);
        System.out.printf("input = %s\n", Arrays.toString(x));
        System.out.printf("output = %s\n", Arrays.toString(y)); 
    }
}