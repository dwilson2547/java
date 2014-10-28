/**
 * Collate
 * 
 * Program takes two strings and collates them together
 * 
 * @author Daniel Wilson wilso509@purdue.edu
 * 
 * @lab LN5
 * 
 * @date September 20, 2014
 **/

public class Collate {

    String collate(String a, String b) {
        String ab = ""; 
        for (int p = 0; p < a.length(); p++) {
            ab = ab + a.charAt(p) + b.charAt(p);
        }
        return ab; 
    }
}