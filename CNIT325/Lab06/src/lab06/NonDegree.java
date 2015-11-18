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
public class NonDegree extends Student{
    String College; 

    public NonDegree(String fName, char mIn, String lName, int puid, String add, String sta, int z, String cou, String coll) {
        super(fName, mIn, lName, puid, add, sta, z, cou);
        this.College = coll; 
    }
    public NonDegree() {
        super(); 
        this.College = null; 
    }
    
    // getter methods

    public String getCollege() {
        return College;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getmInit() {
        return mInit;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPUID() {
        return PUID;
    }

    public String getAddress() {
        return Address;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }
    
    public String getType() {
        return "NonDegree"; 
    }
    
    // Setter

    public void setCollege(String College) {
        this.College = College;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setmInit(char mInit) {
        this.mInit = mInit;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPUID(int PUID) {
        this.PUID = PUID;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
