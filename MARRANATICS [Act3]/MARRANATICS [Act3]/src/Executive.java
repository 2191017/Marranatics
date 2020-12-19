/**
* This class inherits the attributes and methods of the class Employee, which gets the information of an employee
*
*  @author Pascual, Jose; Canlas, Marra; Cezar, Lois
*  @version 1.2
*  @since 2019-02-28
 */

public class Executive extends Employee {
    private double bonus;

/**
* This method sets the bonus of an executive
*
* @param name Name of employee
* @param address Address of employee
* @param phone Number of employee
* @param ssn Security number of employee
* @param rate Rate of work
*/
    public Executive(String name,String address,String phone,String ssn,double rate){
        super(name,address,phone,ssn,rate);
        bonus=0;
    }

    public void awardBonus(double bonusAmount){
        bonus = bonusAmount;
    }

/**
* This method returns the payment of an executive
* @return double Returns the sum of bonus and pay
*/
    public double pay(){
        double paym = super.pay() + bonus;
        bonus = 0;
        return paym;
    }
}

