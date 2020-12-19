/**
 *  This class is inherits the attributes and methods of the class StaffMember, which gets the information of a staff member.
*
*  @author Pascual, Jose; Canlas, Marra; Cezar, Lois
*  @version 1.2
*  @since 2019-02-28
 */

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

/**
* This method sets the personal information of an employee, including the name, security number and pay.
*
*  @param name Name of employee
*  @param address Address of employee
*  @param ssn Phone number of employee
*  @param rate Pay rate of employee
*/
    public Employee(String name,String address,String phone,String ssn,double rate){
        super(name,address,phone);
        socialSecurityNumber=ssn;
        payRate = rate;
    }

/**
* This method turns the result of the social security number into String
*
* @return String Returns the result of the concatenated Strings of socialSecurityNumber
*/
    public String toString(){
        String result = super.toString();
        result+="\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }

/**
*This method returns the pay rate of an employee
*
* @return double Returns the payRate
*/
    public double pay(){
        return payRate;
    }
}
