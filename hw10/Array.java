/**
 * 
 * Array
 * 
 * Program takes an array input and has sum and average methods to compute sum and average of values in array
 * 
 * @author Daniel Wilson
 * 
 * @Lab LN5
 * 
 * @Date September 21, 2014
 * 
 **/ 

public class Array {
    
    private int[] array; 
    
    Array(int[] array) {
        this.array = array;
    }
    
    int sum() {
        int t = 0;
        for (int i = 0; i < array.length; i ++) {
            t = t + array[i];
        }
        return t;
    }
    
    double average() {
        int t = 0;
        for (int i = 0; i < array.length; i ++) {
            t = t + array[i];
        }
        return (double) t / (double) array.length; 
    }
}