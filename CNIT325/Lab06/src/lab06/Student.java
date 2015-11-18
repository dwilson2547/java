/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Daniel
 */
public abstract class Student {
    String firstName; 
    char mInit;
    String lastName;
    int PUID; 
    String Address;
    String state;
    int zip;
    String country; 
    
    public Student(String fName, char mIn, String lName, int puid, String add, String sta, 
            int z, String cou) {
        this.firstName = fName; 
        this.mInit = mIn;
        this.lastName = lName; 
        this.PUID = puid; 
        this.Address = add; 
        this.state = sta; 
        this.zip = z; 
        this.country = cou; 
    }

    public Student() {
        this.firstName = null; 
        this.mInit = ' '; 
        this.lastName = null; 
        this.Address = null; 
        this.PUID = 0; 
        this.state = null; 
        this.zip = 0; 
        this.country = null; 
    }
}
