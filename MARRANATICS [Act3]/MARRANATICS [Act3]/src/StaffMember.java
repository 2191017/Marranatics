/**
*  This class contains the methods in getting the information of a staff member
*
*  @author Pascual, Jose; Canlas, Marra; Cezar, Lois
*  @version 1.2
*  @since 2019-02-28
 */


public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

/**
* This method uses the current class instance variables in the parameters
*
* @param name The name of the staff member
* @param address The address of the staff member
* @param phone The phone number of the staff member
*/
    public StaffMember(String name,String address,String phone){
        this.name=name;
        this.address=address;
        this.phone=phone;
    }

/**
* Returns the concatenated 
* @return String Returns the result of the toString method
*/
    public String toString(){
        String result="Name: " + name + "\n";
        result+="Address: " + address + "\n";
        result+="Phone: " + phone + "\n";
        return result;
    }

    public abstract double pay();
}
