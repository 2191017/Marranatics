/**
*  @author Pascual, Jose; Canlas, Marra; Cezar, Lois
*  @version 1.2
*  @since 2019-02-28
*/

public class Volunteer extends StaffMember {

/**
* This method sets the information of the volunteer
*
* @param name Name of the volunteer
* @param address Address of the volunteer
* @param phone Phone number of the volunteer
*/
    public Volunteer(String name,String address,String phone, String email){
        super(name,address,phone, email);
    }

/**
* Returns pay
* @return double Returns pay
*/
    public double pay(){
        return 0.0;
    }
}
