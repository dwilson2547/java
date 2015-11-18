//******************************************************************************
// Name: Daniel Wilson
// Email: wilso509@purdue.edu
// Lab : Wednesday 1:30 
//******************************************************************************
package lab02;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont = true; 
        while (cont) {
        // hot tub
        double widthHT; 
        double depthHT; 
        // pool
        double widthP;
        double lengthP;
        // deep end
        double lengthD; 
        double depthD;
        // shallow end
        double lengthS; 
        double depthS;
        // walk in section
        double lengthWI; 
        
        // scanner
        Scanner s = new Scanner(System.in); 
        // hot tub width
        System.out.print("Please enter the width of the hot tub (8-14 ft)"); 
        widthHT = s.nextDouble(); 
        while (widthHT < 8 || widthHT > 14) {
            System.out.println("Please enter a valid width");
            widthHT = s.nextDouble(); 
        }
        // hot tub depth
        System.out.print("Please enter the depth of the hot tub (3-5 ft)"); 
        depthHT = s.nextDouble(); 
        while (depthHT < 3 || depthHT > 5) {
            System.out.println("Please enter a valid depth");
            depthHT = s.nextDouble(); 
        }
        // pool length
        System.out.print("Please enter the length of the pool (35-60 ft)"); 
        lengthP = s.nextDouble(); 
        while (lengthP < 35 || lengthP > 60) {
            System.out.println("Please enter a valid length");
            lengthP = s.nextDouble(); 
        }
        // pool width 
        System.out.print("Please enter the width of the pool (15-30 ft)"); 
        widthP = s.nextDouble(); 
        while (widthP < 15 || widthP > 30) {
            System.out.println("Please enter a valid width");
            widthP = s.nextDouble(); 
        }
        // length walk in
        System.out.print("Please enter the length of the walk in (5-" + (lengthP * .33) + " ft)"); 
        lengthWI = s.nextDouble(); 
        while (lengthWI < 5 || lengthWI > (lengthP * .33)) {
            System.out.println("Please enter a valid depth");
            lengthWI = s.nextDouble(); 
        }
        // shallow end depth
        System.out.print("Please enter the depth of the shallow end (2-5 ft)"); 
        depthS = s.nextDouble(); 
        while (depthS < 2 || depthS > 5) {
            System.out.println("Please enter a valid depth");
            depthS = s.nextDouble(); 
        }
        // shallow end length
        System.out.print("Please enter the length of the shallow end (10-" + (lengthP * .33) + " ft)"); 
        lengthS = s.nextDouble(); 
        while (lengthS < 10 || lengthS > (lengthP * .33)) {
            System.out.println("Please enter a valid length");
            lengthS = s.nextDouble(); 
        }
        // deep end depth
        System.out.print("Please enter the depth of the deep end (6-12 ft)"); 
        depthD = s.nextDouble(); 
        while (depthD < 6 || depthD > 12) {
            System.out.println("Please enter a valid depth");
            depthD = s.nextDouble(); 
        }
        // deep end length
        System.out.print("Please enter the length of the deep end (10-" + (lengthP * .5) + " ft)"); 
        lengthD = s.nextDouble(); 
        while (lengthD < 10 || lengthD > (lengthP * .5)) {
            System.out.println("Please enter a valid length");
            lengthD = s.nextDouble(); 
        }
        
        // calculations
        
        // hot tub area 
        // a = pi * r ^2 * d 
        // d = d-6"
        double radHT = widthHT / 2; 
        double areaHT = Math.PI * radHT * radHT * (depthHT - .5); 
        
        // pool area
        double areaWI = .5 * lengthWI * widthP * depthS; 
        double areaS = lengthS * depthS * widthP;
        double areaD = lengthD * depthD * widthP; 
        double lengthT = lengthP - lengthWI - lengthS - lengthD; 
        double areaT = (lengthT * depthS * widthP) + .5 * lengthT * widthP * (depthD - depthS); 
        // amount to subtract
        double rm = .5 * lengthP * widthP; 
        // final pool area
        double areaP = areaWI + areaS + areaD + areaT - rm; 
        
        // capacities 
        double capP = areaP * 7.481; 
        double capHT = areaHT * 7.481; 
        double capT = capP + capHT; 
        // output
        System.out.println("****************************************************"); 
        System.out.println("****************************************************"); 
        System.out.println("Pool Area: " + areaP + "ft^3");
        System.out.println("Hot Tub Area: " + areaHT + "ft^3");
        System.out.println("Pool Capacity: " + capP + "gal");
        System.out.println("Hot Tub Capacity: " + capHT + "gal"); 
        System.out.println("Water needed 6 in. below surface: " + capT + "gal");
        System.out.println("Cost to fill Pool and Hot Tub: $" + (capT * .1));
        System.out.println("****************************************************");
        System.out.println("****************************************************");
     

        System.out.println("Continue? (Y/N)");
        String c = s.next();
        if ("N".equals(c) || "n".equals(c)) 
        {
            cont = false; 
        } 
        }
        System.exit(0); 

    }
    
}
