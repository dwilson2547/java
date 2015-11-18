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
public class Person {
    private Name name; 
    private int PUID;
    private Address addr; 
    private int major; 
    private int favClass; 
    private int Age; 
    private String birthDate; 
    private String gradDate;
    private boolean attendHogwarts; 
    
    public Person() {
        this.name = new Name(); 
        this.PUID = 1000000001;
        this.addr = new Address(); 
        this.major = 0; 
        this.favClass = 0; 
        this.Age = 21; 
        this.birthDate = "11/28/1994"; 
        this.gradDate = "05/14/2017"; 
        this.attendHogwarts = false; 
    }
    public Person(String fName, String lName, char mInit, int puid, 
            String addr1, String addr2, String city, String state, int zip,
            int maj, int fClass, int age, String bD, String gD, boolean aHog) {
        this.name = new Name(fName, lName, mInit); 
        this.PUID = puid; 
        this.addr = new Address(addr1, addr2, city, state, zip); 
        this.major = maj; 
        this.favClass = fClass; 
        this.Age = age; 
        this.birthDate = bD; 
        this.gradDate = gD; 
        this.attendHogwarts = aHog; 
    }
    // getter
    
    public Name getName() {
        return this.name; 
    }
    public int getPUID() {
        return this.PUID; 
    }
    public Address getAddr() {
        return this.addr; 
    }
    public int getMajor() {
        return this.major; 
    }
    public int getFavClass() {
        return this.favClass; 
    }
    public int getAge() {
        return this.Age; 
    }
    public String getBDay() {
        return this.birthDate; 
    }
    public String getGDay() {
        return this.gradDate; 
    }
    public boolean getHogwarts() {
        return this.attendHogwarts; 
    }
    
    //setter
    public void setName(Name a) {
        this.name = a; 
    }
    public void setPUID(int id) {
        this.PUID = id; 
    }
    public void setAddress(Address a) {
        this.addr = a; 
    }
    public void setMajor(int maj) {
        this.major = maj; 
    }
    public void setFavClass(int fc) {
        this.favClass = fc; 
    }
    public void setAge(int a) {
        this.Age = a; 
    }
    public void setBirthDate(String bd) {
        this.birthDate = bd; 
    }
    public void setGradDate(String gd) {
        this.gradDate = gd; 
    }
    public void setHogwarts(boolean hw) {
        this.attendHogwarts = hw; 
    }
}
