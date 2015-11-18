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
public class Address {
    private String Address1; 
    private String Address2; 
    private String City; 
    private String State; 
    private int Zip; 
    
    public Address() {
        this.Address1 = "Hillenbrand hall"; 
        this.Address2 = "1301 3Rd Street"; 
        this.City = "West Lafayette"; 
        this.State = "Indiana"; 
        this.Zip = 47906; 
    }
    
    public Address(String addr1, String addr2, String city, String state, int zip) {
        this.Address1 = addr1; 
        this.Address2 = addr2; 
        this.City = city; 
        this.State = state; 
        this.Zip = zip; 
    }
    
    // getter
    public String getAddr1() {
        return this.Address1; 
    }
    public String getAddr2() {
        return this.Address2; 
    }
    public String getCity() {
        return this.City; 
    }
    public String getState() {
        return this.State; 
    }
    public int getZip() {
        return this.Zip; 
    }
    
    // setter
    public void setAddr1(String addr) {
        this.Address1 = addr; 
    }
    public void setAddr2(String addr) {
        this.Address2 = addr; 
    }
    public void setCity(String city) {
        this.City = city; 
    }
    public void setState(String state) {
        this.State = state;
    }
    public void setZip(int zip) {
        this.Zip = zip; 
    }
}
