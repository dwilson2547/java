/*
 * Author:     Daniel Wilson
 * Email:      Wilso509@purdue.edu
 * Class:      CNIT 325
 * Assignment: Lab 5
 */
package lab05;

/**
 *
 * @author Daniel
 */
public class Name {
    
    private String firstName; 
    private String lastName; 
    private char middleInit; 
    
    public Name() {
        this.firstName = "John"; 
        this.lastName = "Doe";
        this.middleInit = 'A'; 
    }
    
    public Name(String fName, String lName, char mInit) {
        this.firstName = fName; 
        this.lastName = lName; 
        this.middleInit = mInit; 
    }
    
    // getter
    public String getFName() {
        return this.firstName; 
    }
    public String getLName() {
        return this.lastName;
    }
    public char getMInit() {
        return this.middleInit; 
    }
    
    // setter
    public void setFName(String fName) {
        this.firstName = fName; 
    }
    public void setLName(String lName) {
        this.lastName = lName; 
    }
    public void setMInit(char mInit) {
        this.middleInit = mInit; 
    }
}
