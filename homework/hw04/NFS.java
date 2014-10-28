import java.util.Scanner;

public class NFS{
	public static void main(String[] args){
		// define new scanner
		Scanner s = new Scanner(System.in);
		// find the double entered
		double circumference = s.nextDouble();
		// calculate the diameter
		double diameter = circumference / Math.PI;
		// output diameter in correct format
		System.out.printf("%.2f\n", diameter);
	}
}