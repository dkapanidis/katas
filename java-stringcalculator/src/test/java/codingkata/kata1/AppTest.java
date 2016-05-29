package codingkata.kata1;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    public void testAddEmpty() throws Exception {
        assertEquals(0, new App().add(""));
    }

    public void testAddOneNumber() throws Exception {
        assertEquals(2, new App().add("2"));
    }

    public void testAddTwoNumbers() throws Exception {
        assertEquals(5, new App().add("2,3"));
    }

    public void testAddManyNumbers() throws Exception {
        assertEquals(11, new App().add("2,3,4,2"));
        assertEquals(6, new App().add("2,3,1"));
        assertEquals(75, new App().add("2,3,4,2,43,21"));
    }

    public void testAddNewLines() throws Exception {
        assertEquals(11, new App().add("2\n3\n4\n2"));
    }

    public void testAddDelimeter() throws Exception {
        assertEquals(3, new App().add("//;\n1;2"));
    }

    public void testAddOneNegativeNumber() {
        try {
            new App().add("1,2,-5");
        } catch (Exception e) {
            assertEquals("negatives not allowed: [-5]",
                e.getLocalizedMessage());
            return;
        }
        fail();
    }

    public void testAddManyNegativeNumbers() {
        try {
            new App().add("1,2,-5,3,-1");
        } catch (Exception e) {
            assertEquals("negatives not allowed: [-5, -1]",
                e.getLocalizedMessage());
            return;
        }
        fail();
    }

    public void testAddBigNumbers() {
        assertEquals(2, new App().add("2,10001"));
        assertEquals(2, new App().add("2,10000000000000001"));
    }

    // public void testAddWithBigDelimiters() {
    //     assertEquals(6, new App().add("//[***]\n1***2***3"));
    // }

}
