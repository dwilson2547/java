/**
 * 
 * Zombie
 * 
 * returns number of zombies and description of each zombie
 * 
 * @author Daniel Wilson <wilso509@purdue.edu>
 * 
 * @lab LN5
 * 
 * @date September 30, 2014
 * 
 **/ 

public class Zombie {
    
    private String name; 
    private int serial; 
    private static int count = 0; 
    
    Zombie(String s) {
        this.name = s; 
        this.serial = count;
        count++;
        
    }
    
    // create printZombie static method
    
    static void printStatus() {
        System.out.println(count + " zombies created so far"); 
    }
    
    public void printZombie() {
        System.out.println(this.name + " is zombie " + this.serial); 
    }
    
    public static void main(String[] args) {
        printStatus(); 
        
        Zombie z1 = new Zombie("Fred"); 
        
        printStatus(); 
        
        Zombie z2 = new Zombie("Ethel");

        printStatus();
        
        Zombie z3 = new Zombie("Lucy");

        printStatus();
        
        z1.printZombie();
        z2.printZombie();
        z3.printZombie();
    }
}
