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
// imports
import java.util.ArrayList; 
import java.util.Random; 

public class Zombie {
    
    private String name; 
    private int serial; 
    private static ArrayList<Zombie> list = new ArrayList<Zombie>();
    private static int count = 0; 
    
    
    Zombie(String s) {
        this.name = s; 
        count++; 
        this.serial = count;
        // add to arraylist
        list.add(this); 
    }
    
    // create printZombie static method
    
    public static int getCount() {
        return count; 
    }
    
    public static Zombie getZombie(int i) {
        return list.get(i); 
    }
    
    static void printStatus() {
        System.out.println(count + " zombies created so far"); 
    }
    
    public void printZombie() {
        System.out.println(this.name + " is zombie " + this.serial); 
    }
    
    public static void main(String[] args) {
        while (Math.random() < 0.9)
            new Zombie("Z" + (int) (Math.random() * 1000));
 
        for (int i = 0; i < getCount(); i++)
            getZombie(i).printZombie();
    }
}
