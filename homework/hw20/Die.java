/** 
 * 
 * Die
 * 
 * Application mimmicks a die
 * 
 * @author Daniel Wilson <wilso509@purdue.edu>
 * 
 * @Lab LN5
 * 
 * @date October 17, 2014
 * 
 **/

// imports
import java.util.Random; 

public class Die {
    public int roll() {
        Random a = new Random(); 
        int number = a.nextInt(6) + 1; 
        return number; 
    }
}
class WeightedDie extends Die {
    public int roll() {
        if (Math.random() < .5) {
            return super.roll(); 
        }
        else {
            return 6; 
        }
    }
}