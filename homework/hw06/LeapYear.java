/**
 * LeapYear
 * 
 * program checks if year inputted by user is a leap year
 * 
 * @author Daniel Wilson
 * 
 * @lab LN5
 * 
 * @date September 13, 2014
 *
 **/

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else 
            return false;
    }
}