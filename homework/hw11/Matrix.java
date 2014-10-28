/*
 * Matrix
 * 
 * Program takes matrix input into constructor and has sum method that computes and returns sum of all
 * elements in matrix
 * 
 * @author Daniel Wilson
 * 
 * @Lab LN5
 * 
 * @date September 24, 2014
 * 
 **/ 

public class Matrix {
    int[][] matrix; 
    public Matrix(int[][] matrix) {
        this.matrix = matrix; 
    }
    
    public int sum() {
        // define new variable to hold value for sum of array
        int sum = 0; 
        // define loop for rows 
        for (int r = 0; r < matrix.length; r++) {
            // define loop for columns 
            for (int c = 0; c < matrix[r].length; c++) {
                sum = sum + matrix[r][c]; 
            }
        }
        // return the sum of all values in matrix 
        return sum; 
    }
}