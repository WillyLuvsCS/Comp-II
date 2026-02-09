import org.junit.jupiter.api.Test; // lets u use @Test

import static org.junit.jupiter.api.Assertions.*; // imports static assertion methods

// Testing file; Generally test each scenario of what you are testing.

class JUnitExampleTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        var addTest = new JUnitExample(); // local variable type inference (takes name from right)
        // Built in Junit Method "Assert
        assertEquals(4, addTest.add(2, 2)); // valid test but more scenarios
    }
    // run the test shows in terminal info (pass/fail, etc)

    // you should always run multiple diff types of test
    // ex: in main 2 * 2 also = 4 so this assertEquals test is not equal

    /*
    assertNotEquals()
    assertTrue();
    assertFalse();
    assertNull();
    assertNotNull();

    assertTrue(addTest.add(2, 2) == 4);
     */

    // 2nd Test for better test suite
    @Test
    void threePlusSevenShouldEqualFour() {
        var addTest = new JUnitExample(); // local variable type inference (takes name from right)
        // Built in Junit Method "Assert
        assertEquals(10, addTest.add(3, 7)); // valid test but more scenarios
    }
}

