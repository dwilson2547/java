public class Emote implements Laughable, Cryable, Shoutable {
    // laughable vars
    int times; 
    // cryable vars
    int tears; 
    boolean moaning; 
    // shoutable vars
    double volume; 
    String words; 
    // main method
    
    public boolean laugh(int times) {
        return true; 
    }
    
    public void cry(int tears, boolean moaning) {
        // void
    }
    
    public void laugh(double volume, String words) {
        // void
    }
    
    public static void main(String[] args) {
        // code goes here
    }
}