/**
 * 
 * Hop
 * 
 * Program prints out "Hop \n Skip \n Jump \n" using sublcasses
 * 
 * @author Daniel Wilson <Wilso509@purdue.edu> 
 * 
 * @lab LN5
 * 
 * @date October 14, 2014
 * 
 **/

public class Hop {
    Hop() {
        System.out.println("Hop"); 
    }
    public static void main(String[] args) {
        Jump a = new Jump();
    }
}

class Skip extends Hop {
    Skip() {
        System.out.println("Skip");
    }
}

class Jump extends Skip {
    Jump() {
        System.out.println("Jump"); 
    }
}

