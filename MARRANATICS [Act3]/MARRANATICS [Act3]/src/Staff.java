/**
* This class prints a list of information of the staff
*
*  @author Pascual, Jose; Canlas, Marra; Cezar, Lois
*  @version 1.2
*  @since 2019-02-28
*/

public class Staff {
    private final StaffMember[] staffList = new StaffMember[5];

/**
* This method lists the information of the staff
*/
    public Staff(){
        staffList[0] = new Executive("Tony","123 Main Street","555-0469","123-45-6789",2423.07);
        staffList[1] = new Employee("Paula","456 Main Street","555-010","456-45-6789",1247.10);
        staffList[2] = new Employee("Steven","456 Main Street","555-010","456-45-6789",3247.10);
        staffList[3] = new Hourly("Jenny","467 Main Street","555-010","467-45-6789",4247.10);
        staffList[4] = new Volunteer("Adrianne","776 Main Street","785-010");

        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
    }

/**
* This method prints the amount of pay of a staff member
*/ 
    public void payday(){
        double amount;

        for(int count=0;count<staffList.length;count++){
            System.out.println(staffList[count]);
            amount = staffList[count].pay();
            if (amount==0.0){
                System.out.println("Thanks.");
            } else
                System.out.println("Paid: " + amount);

            System.out.println("============================================================");
        }
    }
}
