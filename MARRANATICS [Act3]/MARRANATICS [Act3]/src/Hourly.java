/**
* This class inherits the class Employee and calculates the hourly pay of an employee
*
*  @author Pascual, Jose; Canlas, Marra; Cezar, Lois
*  @version 1.2
*  @since 2019-02-28
*/

public class Hourly extends Employee {
    private int hoursWorked;
/**
* This method sets the hourly rate of an employee
*
* @param name Name of employee
* @param address Address of employee
* @param phone Number of employee
* @param ssn Security number of employee
* @param rate Rate of work
*/
   public Hourly(String name,String address,String phone,String ssn,double rate)
   {
       super(name,address,phone,ssn,rate);hoursWorked=0;}
    }

/**
* This method increments the hours worked by an employee
* @param hrs The hours worked by an employee
*/
    public void addHours(int hrs){
        hoursWorked+=hrs;
    }

/**
* This method returns the pay of an employee by calculating the payRate by the hoursWorked
* @return double Returns the product of payRate and hoursWorked
*/
    public double pay(){
        double payment=payRate*hoursWorked;return payment;
    }
/**
* This method returns the concatenated String ofthe current work hours
* @return String Returns the result of the toString method
*/
    public String toString(){
        String result=super.toString();
        result+="\nCurrent Hours: " + hoursWorked;
        return result;
    }
}
