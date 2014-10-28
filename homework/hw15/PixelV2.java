/**
 * 
 * PixelV2
 * 
 * (description)
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
    private int getRed() {
        int pixel = this.pixel;
        pixel = pixel >> 16; 
        return (pixel & 0xFF); 
    }
    
    // get freen helper method
    private int getGreen() {
        int pixel = this.pixel;
        pixel = pixel >> 8; 
        return (pixel & 0xFF);
    }
    
    // get blue helper method
    private int getBlue() {
        int pixel = this.pixel; 
        pixel = pixel >> 0; 
        return (pixel & 0xFF);
    }
    
    // main method
    public static void main(String[] args) {
        PixelV2 p1 = new Pixel(0xFFFF00FF);
        System.out.printf("rgb = (%2x, %2x, %2x)\n", p1.getRed(), p1.getGreen(), p1.getBlue());
        System.out.printf("rgb = (%d, %d, %d)\n", p1.getRed(), p1.getGreen(), p1.getBlue());
        
        PixelV2 p2 = new Pixel(0xFF43BF11);
        System.out.printf("rgb = (%2x, %2x, %2x)\n", p2.getRed(), p2.getGreen(), p2.getBlue());
        System.out.printf("rgb = (%d, %d, %d)\n", p2.getRed(), p2.getGreen(), p2.getBlue());
    }
}