import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolunteerTest {

    private Volunteer volunteerUnderTest;

    @Before
    public void setUp() {
        volunteerUnderTest = new Volunteer("name", "address", "phone");
    }

    /**
     * Tester for returning the payment of a volunteer.
     */

    @Test
    public void testPay() {
        // Setup

        // Run the test
        final double result = volunteerUnderTest.pay();

        // Verify the results
        assertEquals(0.0, result, 0.0001);
        assertEquals(0.5, result, 0.5);
    }
}
