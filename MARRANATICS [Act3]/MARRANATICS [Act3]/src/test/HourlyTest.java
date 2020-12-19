import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HourlyTest {

    private Hourly hourlyUnderTest;

    @Before
    public void setUp() {
        hourlyUnderTest = new Hourly("name", "address", "phone", "ssn", 0.0);
    }


    /**
     * Tester for incrementing the hours worked of an employee.
     */
    @Test
    public void testAddHours() {
        // Setup

        // Run the test
        hourlyUnderTest.addHours(0);

        // Verify the results
    }

    /**
     * Tester for calculating the payment of an employee.
     */

    @Test
    public void testPay() {
        // Setup

        // Run the test
        final double result = hourlyUnderTest.pay();

        // Verify the results
        assertEquals(0.0, result, 0.0001);
    }

    /**
     * Tester for returning the concatenated current work hours of an employee.
     */

    @Test
    public void testToString() {
        // Setup

        // Run the test
        final String result = hourlyUnderTest.toString();

        // Verify the results
        assertEquals("Name: name\n" +
                "Address: address\n" +
                "Phone: phone\n" +
                "\n" +
                "Social Security Number: ssn\n" +
                "Current Hours: 0", result);
    }
}
