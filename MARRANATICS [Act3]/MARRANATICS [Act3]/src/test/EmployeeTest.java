import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employeeUnderTest;

    @Before
    public void setUp() {
        employeeUnderTest = new Employee("name", "address", "phone", "ssn", 0.0);
    }


    /**
     * Tester for setting all of the personal information of an employee.
     */

    @Test
    public void testToString() {
        // Setup

        // Run the test
        final String result = employeeUnderTest.toString();

        // Verify the results
        assertEquals("Name: name\n" +
                "Address: address\n" +
                "Phone: phone\n" +
                "\n" +
                "Social Security Number: ssn", result);
    }


    /**
     * Tester for getting the payrate of an employee.
     */

    @Test
    public void testPay() {
        // Setup

        // Run the test
        final double result = employeeUnderTest.pay();

        // Verify the results
        assertEquals(0.0, result, 0.0001);
    }
}
