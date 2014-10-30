import javax.swing.JOptionPane; 

public class Prompter {
    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog(null, "Please enter a number: "); 
        int value = Integer.parseInt(string); 
        
        if (value % 2 == 0) 
        {
            JOptionPane.showMessageDialog(null, value + " is an even number"); 
        }
        else {
            JOptionPane.showMessageDialog(null, value + " is an odd number"); 
        }
    }
}