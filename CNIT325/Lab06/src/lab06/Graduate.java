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
public class Graduate extends Student{
    String major; 
    boolean Thesis;                      // 0 = thesis; 1 = non-thesis
    boolean MS;                                // 0 = MS; 1 = PHD

    public Graduate(String fName, char mIn, String lName, int puid, String add, String sta, int z, String cou, String maj, boolean tONT, boolean msOPHD) {
        super(fName, mIn, lName, puid, add, sta, z, cou);
        this.major = maj; 
        this.Thesis = tONT; 
        this.MS = msOPHD; 
    }
    public Graduate () {
        super(); 
        this.major = null; 
        this.Thesis = true; 
        this.MS = true; 
    }
    // Getter

    public String getMajor() {
        return major;
    }

    public boolean getThesisOrNonThesis() {
        return Thesis;
    }

    public boolean getMsOrPhd() {
        return MS;
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
        return "Graduate"; 
    }
    
    // Setter

    public void setMajor(String major) {
        this.major = major;
    }

    public void setThesisOrNonThesis(boolean thesisOrNonThesis) {
        this.Thesis = thesisOrNonThesis;
    }

    public void setMsOrPhd(boolean msOrPhd) {
        this.MS = msOrPhd;
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
