/**
 * 
 * Pixel
 * 
 * gets and sets values for pixels
 * 
 * @author Daniel Wilson <wilso509@purdue.edu>
 * 
 * @lab LN5
 * 
 * @date October 3, 2014
 * 
 **/

public class Pixel {
    
    // define integer for constructor
    private int pixel; 
    
    // constructor
    public Pixel(int pixel) {
        this.pixel = pixel; 
    }
    
    // get red helper method
    public int getRed() {
        int pixel = this.pixel;
        pixel = pixel >> 16; 
        return (pixel & 0xFF); 
    }
    
    // get freen helper method
    public int getGreen() {
        int pixel = this.pixel;
        pixel = pixel >> 8; 
        return (pixel & 0xFF);
    }
    
    // get blue helper method
    public int getBlue() {
        int pixel = this.pixel; 
        pixel = pixel >> 0; 
        return (pixel & 0xFF);
    }
    
    // mututator methods
    
    // set red mutator method
    public void setRed(int red) {
        int pixel = this.pixel; 
        pixel = pixel & ~(0x00FF0000);
        red = red & 0xFF;
        red = red << 16; 
        this.pixel = (pixel | red); 
    }
    
    // set green mutator method
    public void setGreen(int green) {
        int pixel = this.pixel;
        pixel = pixel & ~(0x0000FF00);
        green = green & 0xFF;
        green = green << 8;
        this.pixel = (pixel | green); 
    }
    
    // set blue mutator method
    public void setBlue(int blue) {
        int pixel = this.pixel; 
        pixel = pixel & ~(0x000000FF);
        blue = blue & 0xFF; 
        this.pixel = (pixel | blue);
    }
    
    // main method
    public static void main(String[] args) {
        Pixel p1 = new Pixel(0xFFFF00FF);
        System.out.printf("rgb = (%2x, %2x, %2x)\n", p1.getRed(), p1.getGreen(), p1.getBlue());
        System.out.printf("rgb = (%d, %d, %d)\n", p1.getRed(), p1.getGreen(), p1.getBlue());
        
        Pixel p2 = new Pixel(0xFF43BF11);
        System.out.printf("rgb = (%2x, %2x, %2x)\n", p2.getRed(), p2.getGreen(), p2.getBlue());
        System.out.printf("rgb = (%d, %d, %d)\n", p2.getRed(), p2.getGreen(), p2.getBlue());
        
        Pixel p3 = new Pixel(0xFF000000);
        System.out.printf("rgb = (%d, %d, %d)\n", p3.getRed(), p3.getGreen(), p3.getBlue());
        
        p3.setRed(42);
        p3.setGreen(18);
        p3.setBlue(225);
        System.out.printf("rgb = (%d, %d, %d)\n", p3.getRed(), p3.getGreen(), p3.getBlue());
        
        p3.setRed(-1);
        p3.setGreen(500);
        p3.setBlue(1000);
        System.out.printf("rgb = (%d, %d, %d)\n", p3.getRed(), p3.getGreen(), p3.getBlue());
    }
}