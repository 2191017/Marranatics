import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaffMemberTest {

    private StaffMember staffMemberUnderTest;

    @Before
    public void setUp() {
        staffMemberUnderTest = new StaffMember("name", "address", "phone") {
            @Override
            public double pay() {
                return 0;
            }
        };
    }

    /**
     * Tester for getting the information of a staff member.
     */

    @Test
    public void testToString() {
        // Setup

        // Run the test
        final String result = staffMemberUnderTest.toString();

        // Verify the results
        assertEquals("Name: name\n" +
                "Address: address\n" +
                "Phone: phone\n", result);
    }
}
