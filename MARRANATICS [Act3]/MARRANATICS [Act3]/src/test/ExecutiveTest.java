import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecutiveTest {

    private Executive executiveUnderTest;

    @Before
    public void setUp() {
        executiveUnderTest = new Executive("name", "address", "phone", "ssn", 0.0);
    }

    /**
     * Tester for setting award bonus of an executive.
     */

    @Test
    public void testAwardBonus() {
        // Setup

        // Run the test
        executiveUnderTest.awardBonus(0.0);

        // Verify the results
    }

    /**
     * Tester for returning the payment of an executive.
     */

    @Test
    public void testPay() {
        // Setup

        // Run the test
        final double result = executiveUnderTest.pay();

        // Verify the results
        assertEquals(0.0, result, 0.0001);
    }
}
