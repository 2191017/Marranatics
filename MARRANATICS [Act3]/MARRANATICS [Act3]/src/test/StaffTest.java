import org.junit.Before;
import org.junit.Test;

public class StaffTest {

    private Staff staffUnderTest;

    @Before
    public void setUp() {
        staffUnderTest = new Staff();
    }

    /**
     * Tester for printing the pay of a staff member.
     */

    @Test
    public void testPayday() {
        // Setup

        // Run the test
        staffUnderTest.payday();

        // Verify the results
    }
}
