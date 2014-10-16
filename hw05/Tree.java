/** 
 * Tree
 * 
 * Program takes input for a tree and then describes it when user calls the define method
 * 
 * @author Daniel Wilson
 * 
 * @lab LN5
 * 
 * @date September 10, 2014
 *
 */

public class Tree {
	public static void main(String[] args) {
	}
	// define variables 
    int serial;						// holds serial for tree
    double circumference;			// holds circumference for tree
    String species; 					// holds species for tree
    // define constructor 
    Tree(int serial, double circumference, String species) {
        this.serial = serial;
		this.circumference = circumference;
		this.species = species;
	}
	// define describe method 
	public String describe() {
		String output = String.format("Tree number %d has a circumference of %.2f and is of species %s.", 
			serial, circumference, species);
		return output; 
	}  
}